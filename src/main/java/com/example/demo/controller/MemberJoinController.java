package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.MemberJoinDTO;
import com.example.demo.service.MemberJoinService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MemberJoinController {
	
	private final MemberJoinService memberJoinService;
	
	@PostMapping("/login")
	public String MemberJoin(@RequestBody MemberJoinDTO memberJoinDTO) {
		System.out.println(memberJoinDTO);
		memberJoinService.MemberJoin(memberJoinDTO);
		return "성공";
	}
}
