package com.coding404.myweb.product.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coding404.myweb.command.TopicVO;

@Mapper
public interface TopicMapper {

	int topicRegist(TopicVO vo); //등록
	ArrayList<TopicVO> getListAll(int top_id); //전체목록
	ArrayList<TopicVO> getListMe(String top_writer); //내글목록
	TopicVO getDetail(int top_id); //상세보기 - 글번호(PK)
	int topicModify(TopicVO vo); //수정
	void topicDelete(int top_id); //삭제 - 글번호(PK)
}
