package com.nongyou.generator.web;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.guava.GuavaCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.common.cache.CacheBuilder;

@Configuration
public class CacheConfig {
	@Bean
	public GuavaCache idCache() {
		return new GuavaCache("id", CacheBuilder.newBuilder().recordStats().maximumSize(10)
				.expireAfterWrite(1, TimeUnit.MILLISECONDS).build());
	}

	@Bean
	public CacheManager cacheManager() {
		SimpleCacheManager manager = new SimpleCacheManager();
		List<Cache> list = new ArrayList<>();
		list.add(idCache());
		manager.setCaches(list);
		return manager;
	}
}
