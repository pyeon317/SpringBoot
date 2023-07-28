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

	private Integer top_id;//글번호
	private LocalDateTime top_regdate;
	private String top_enddate;
	private String top_writer;
	private String top_title;
	private String top_content;
}
