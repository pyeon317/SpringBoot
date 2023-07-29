package com.coding404.myweb.product.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.TopicVO;

@Service("TopicService")
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicMapper topicMapper;
	
	@Override
	public int topicRegist(TopicVO vo) {
		
		return topicMapper.topicRegist(vo);
	}

	@Override
	public ArrayList<TopicVO> getListAll(int top_id) {
		// TODO Auto-generated method stub
		return topicMapper.getListAll(top_id);
	}

	@Override
	public ArrayList<TopicVO> getListMe(String top_writer) {
		// TODO Auto-generated method stub
		return topicMapper.getListMe(top_writer);
	}

	@Override
	public TopicVO getDetail(int top_id) {
		// TODO Auto-generated method stub
		return topicMapper.getDetail(top_id);
	}

	@Override
	public int topicModify(TopicVO vo) {
		// TODO Auto-generated method stub
		return topicMapper.topicModify(vo);
	}

	@Override
	public void topicDelete(int top_id) {
		// TODO Auto-generated method stub
		topicMapper.topicDelete(top_id);
	}

}
