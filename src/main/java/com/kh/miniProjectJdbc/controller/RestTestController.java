package com.kh.miniProjectJdbc.controller;

import com.kh.miniProjectJdbc.vo.MemberVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/get-api")
public class RestTestController {
	//@GetMapping("/hello")
	
	
	
	
	
	
	// 쿼리 형식으로 닶을 전달하는 방식 (RequestParams)
	@GetMapping("/search")
	public String getRequestParam(
		@RequestParam String name,
		@RequestParam String email,
		@RequestParam String password) {
		return "이름 : " + name + " 이메일 :" + email + " 비밀번호 : " + password;
	}
	
	// 쿼리형식으로 값을 전달하는데 객체로 받는 방식
	@GetMapping("/search2")
	public String getRequestParam2(MemberVo vo){
		return vo.toString();
	}
	
}
