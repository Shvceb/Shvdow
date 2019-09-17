package cn.bitzh.service;

import java.util.List;

import cn.bitzh.model.MajorVolunteer;
import cn.bitzh.model.vo.VolunteerNameVo;

public interface MajorVolunteerService extends BaseService<MajorVolunteer> {
	VolunteerNameVo queryVolunteerNameByStudentId(String studentId);
}
