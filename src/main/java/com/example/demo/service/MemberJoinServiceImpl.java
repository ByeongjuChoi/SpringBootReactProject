package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.MemberJoinDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.MemberJoinRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberJoinServiceImpl implements MemberJoinService{
	
	private final MemberJoinRepository memberJoinRepository;
	
	@Override
	@Transactional
	public void MemberJoin(MemberJoinDTO memberJoinDTO) {
		
		UserEntity userEntity = UserEntity.builder()
				.userId(memberJoinDTO.getId())
				.userPw(memberJoinDTO.getPw())
				.userNickName(memberJoinDTO.getNickName())
				.build();
		
		memberJoinRepository.save(userEntity);
	}
}
