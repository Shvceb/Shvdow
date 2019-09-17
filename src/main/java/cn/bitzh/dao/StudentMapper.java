package cn.bitzh.dao;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.Student;
import cn.bitzh.model.vo.VolunteerAndResultVo;
import tk.mybatis.mapper.common.Mapper;

public interface StudentMapper extends Mapper<Student> {
	VolunteerAndResultVo selectVolterAndResByStudentId(@Param("studentId") String studentId);
}