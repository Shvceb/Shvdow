package cn.bitzh.service;

import cn.bitzh.model.Student;
import cn.bitzh.model.vo.VolunteerAndResultVo;
import cn.bitzh.model.vo.VolunteerNameVo;

public interface StudentService extends BaseService<Student> {
	VolunteerAndResultVo queryVolterAndResByStudentId(String studentId);
}
