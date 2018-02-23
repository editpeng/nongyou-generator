package com.nongyou.generator.web;

import java.util.concurrent.atomic.LongAdder;

public class IdVo {
	private LongAdder order = new LongAdder();
	private Long timeInMs;
	private Integer serverId;

	public IdVo() {
		super();
	}

	public IdVo(Long timeInMs,Integer serverId) {
		super();
		this.timeInMs = timeInMs;
		this.serverId = serverId;
	}

	public LongAdder getOrder() {
		return order;
	}

	public void setOrder(LongAdder order) {
		this.order = order;
	}

	public Long getTimeInMs() {
		return timeInMs;
	}

	public void setTimeInMs(Long timeInMs) {
		this.timeInMs = timeInMs;
	}

	public String getId() {
		order.add(10);
		return String.format("%02d", serverId)+String.format("%015d", timeInMs) + String.format("%04d", order.intValue());
	}

	public Integer getServerId() {
		return serverId;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}
}
