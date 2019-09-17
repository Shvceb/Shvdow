package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.DirectionVolunteerMapper;
import cn.bitzh.model.DirectionVolunteer;
import cn.bitzh.model.vo.VolunteerNameVo;
import cn.bitzh.service.DirectionVolunteerService;

@Transactional
@Service("directionVolunteerService")
public class DirectionVolunteerServiceImpl extends BaseServiceImpl<DirectionVolunteer>
		implements DirectionVolunteerService {

	@Autowired
	private DirectionVolunteerMapper directionVolunteerMapper;

	@Override
	public VolunteerNameVo queryVolunteerNameByStudentId(String studentId) {
		// TODO Auto-generated method stub
		return directionVolunteerMapper.selectVolunteerNameByStudentId(studentId);
	}

}
