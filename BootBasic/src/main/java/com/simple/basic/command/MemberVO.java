package com.simple.basic.command;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberVO {

	@Pattern(regexp = "[A-Za-z0-9]{8,}", message = "??")
	private String id;
	@Pattern(regexp = "[A-Za-z0-9`~!@#$%^&*()-_=+]{8,}", message = "??")
	private String pw;
}
