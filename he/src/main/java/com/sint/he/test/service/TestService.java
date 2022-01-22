package com.sint.he.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sint.he.test.mapper.TestMapper;
import com.sint.he.test.vo.TestVo;

@Service
public class TestService {
	@Autowired
	public TestMapper mapper;

	public List<TestVo> selectTest() {
		return mapper.selectTest();
	}
}
