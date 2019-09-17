package cn.bitzh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.Major;
import cn.bitzh.model.vo.MajorChoiceVo;
import tk.mybatis.mapper.common.Mapper;

public interface MajorMapper extends Mapper<Major> {
	List<MajorChoiceVo> selectMajorChoiceList();

	List<MajorChoiceVo> selectMajorChoiceByWords(@Param("word") String word);
}