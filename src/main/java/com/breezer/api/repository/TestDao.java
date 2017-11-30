package com.breezer.api.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.breezer.api.vo.TestVo;

@Repository
public class TestDao {

	
	@Autowired
	private SqlSession sqlSession;
	
	
	public int insert(TestVo vo) {
		
		return sqlSession.insert("test.inserttest", vo);
	}
}


