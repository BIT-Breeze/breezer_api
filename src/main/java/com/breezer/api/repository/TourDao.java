package com.breezer.api.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TourDao {

	@Autowired
	private SqlSession sqlSession;
	
	
	
	
	public int insert() {
		return sqlSession.insert("tour.insert");
	}
}
