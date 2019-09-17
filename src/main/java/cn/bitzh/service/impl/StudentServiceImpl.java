package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.StudentMapper;
import cn.bitzh.model.Student;
import cn.bitzh.model.vo.VolunteerAndResultVo;
import cn.bitzh.model.vo.VolunteerNameVo;
import cn.bitzh.service.StudentService;

@Transactional
@Service("studentService")
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public VolunteerAndResultVo queryVolterAndResByStudentId(String studentId) {
		// TODO Auto-generated method stub
		return studentMapper.selectVolterAndResByStudentId(studentId);
	}

}
