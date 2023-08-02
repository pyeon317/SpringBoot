package com.coding404.myweb.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopicVO {

	private Integer top_id;//글번호,pk
	private LocalDateTime top_regdate; //등록일
	private String top_writer; //작성자
	private String top_title; //제목
	private String top_content; //내용
}
