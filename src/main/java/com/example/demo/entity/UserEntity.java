package com.example.demo.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@Table(name = "UserT")
public class UserEntity {

	@Id
	@Column(name = "pkId", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pkId;
	
	@Column(name = "userId", nullable = false)
	private String userId;
	
	@Column(name = "userPw", nullable = false)
	private String userPw;
	
	@Column(name = "userNickName", nullable = false)
	private String userNickName;
	
	@CreationTimestamp
	@Column(name = "createDate", nullable = false)
	private LocalDateTime createDate;
}
