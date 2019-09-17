package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.MajorVolunteerMapper;
import cn.bitzh.model.MajorVolunteer;
import cn.bitzh.model.vo.VolunteerNameVo;
import cn.bitzh.service.MajorVolunteerService;

@Transactional
@Service("majorVolunteerService")
public class MajorVolunteerServiceImpl extends BaseServiceImpl<MajorVolunteer> implements MajorVolunteerService {
	@Autowired
	private MajorVolunteerMapper majorVolunteerMapper;

	@Override
	public VolunteerNameVo queryVolunteerNameByStudentId(String studentId) {
		// TODO Auto-generated method stub
		return majorVolunteerMapper.selectVolunteerNameByStudentId(studentId);
	}
}
