package com.nongyou.generator.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class IdService {
	@Value("${server.id}")
	private Integer serverId;
	
	@Cacheable(value="id",key = "#id.toString()")
    public IdVo getIdVo(Long id) {
        return new IdVo(id,serverId);
    }
}