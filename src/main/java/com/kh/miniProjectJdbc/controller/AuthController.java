package com.kh.miniProjectJdbc.controller;

import com.kh.miniProjectJdbc.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/auth")
public class AuthController {
	// 로그인
	@PostMapping("/login")
	public ResponseEntity<Boolean> login(@RequestBody MemberVO vo) {
		log.info("memberVO : {}", vo);
		return ResponseEntity.ok(true);
	}
	// 회원가입
	@PostMapping("/login/signup")
	public ResponseEntity<Boolean> signup(@RequestBody MemberVO vo) {
		log.info("memberVO : {}", vo);
		return ResponseEntity.ok(true);
	}
}
