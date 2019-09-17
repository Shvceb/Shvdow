package cn.bitzh.service;

import cn.bitzh.model.DirectionVolunteer;
import cn.bitzh.model.vo.VolunteerNameVo;

public interface DirectionVolunteerService extends BaseService<DirectionVolunteer> {
	VolunteerNameVo queryVolunteerNameByStudentId(String studentId);
}
