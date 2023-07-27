package com.simple.basic.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemoVO {
	
	private Integer mno;
	
	@NotBlank(message = "내용은 필수 입니다")
	private String memo;
	@Pattern (regexp = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}",message = "?")
	private String phone;
	@Pattern (regexp = "[0-9]{4}",message = "?")
	private String pw;
	private String secret;//?
}
