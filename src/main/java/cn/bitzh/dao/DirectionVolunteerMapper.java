package cn.bitzh.dao;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.DirectionVolunteer;
import cn.bitzh.model.vo.VolunteerNameVo;
import tk.mybatis.mapper.common.Mapper;

public interface DirectionVolunteerMapper extends Mapper<DirectionVolunteer> {
	VolunteerNameVo selectVolunteerNameByStudentId(@Param("studentId") String studentId);
}