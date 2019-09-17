package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.ChangeMajorMapper;
import cn.bitzh.model.ChangeMajor;
import cn.bitzh.service.ChangeMajorService;

@Transactional
@Service("changeMajorService")
public class ChangeMajorServiceImpl extends BaseServiceImpl<ChangeMajor> implements ChangeMajorService {

	@Autowired
	private ChangeMajorMapper changeMajorMapper;

	@Override
	public List<ChangeMajor> queryChangeMajorToCheck() {
		// TODO Auto-generated method stub
		return changeMajorMapper.selectChangeMajorToCheck();
	}

	@Override
	public List<ChangeMajor> queryChangeMajorCheckHistory() {
		// TODO Auto-generated method stub
		return changeMajorMapper.selectChangeMajorCheckHistory();
	}

	@Override
	public List<ChangeMajor> queryChangeMajorListByStudentId(String studentId) {
		// TODO Auto-generated method stub
		return changeMajorMapper.selectChangeMajorListByStudentId(studentId);
	}

}
