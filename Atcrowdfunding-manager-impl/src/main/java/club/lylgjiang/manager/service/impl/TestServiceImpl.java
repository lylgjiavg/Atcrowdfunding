package club.lylgjiang.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import club.lylgjiang.manager.dao.TestDao;
import club.lylgjiang.manager.service.TestService;

public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao testDao;
	
	@Override
	public int insertUser(String name) {
		
		return testDao.insert(name);
	}

}
