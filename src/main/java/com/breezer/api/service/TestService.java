package com.breezer.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breezer.api.repository.TestDao;
import com.breezer.api.vo.TestVo;

@Service
public class TestService {

	@Autowired
	private TestDao testDao;
	
	
	public boolean insertMessage(TestVo vo) {
		
		
		return testDao.insert(vo) == 1;
	}
}
