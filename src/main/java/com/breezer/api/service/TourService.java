package com.breezer.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breezer.api.repository.TourDao;

@Service
public class TourService {

	@Autowired
	private TourDao tourDao;
	
	public boolean insertMessage() {
		return tourDao.insert() == 1;
	}
}
