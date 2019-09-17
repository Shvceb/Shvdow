package cn.bitzh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.MajorVolunteer;
import cn.bitzh.model.vo.VolunteerNameVo;
import tk.mybatis.mapper.common.Mapper;

public interface MajorVolunteerMapper extends Mapper<MajorVolunteer> {
	VolunteerNameVo selectVolunteerNameByStudentId(@Param("studentId") String studentId);
}