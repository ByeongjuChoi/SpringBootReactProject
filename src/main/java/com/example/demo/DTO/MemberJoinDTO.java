package com.example.demo.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MemberJoinDTO {
	String id;
	String pw;
	String nickName;
	LocalDateTime createDate;
}
