package cn.bitzh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.ChangeMajor;
import tk.mybatis.mapper.common.Mapper;

public interface ChangeMajorMapper extends Mapper<ChangeMajor> {
	List<ChangeMajor> selectChangeMajorToCheck();

	List<ChangeMajor> selectChangeMajorCheckHistory();

	List<ChangeMajor> selectChangeMajorListByStudentId(@Param("studentId") String studentId);
}