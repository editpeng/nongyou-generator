package com.nongyou.generator.web;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdGenerator {
	@Autowired
	private IdService idService;
	
	@GetMapping("/generate")
	public String generate() {
		String id = idService.getIdVo(new Date().getTime()).getId();
		System.out.println(id);
		return id;
	}
}
