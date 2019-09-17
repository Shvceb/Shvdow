package cn.bitzh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.Direction;
import cn.bitzh.model.vo.DirectionChoiceVo;
import tk.mybatis.mapper.common.Mapper;

public interface DirectionMapper extends Mapper<Direction> {
	List<DirectionChoiceVo> selectDirectionChoiceList();

	List<DirectionChoiceVo> selectDirectionChoiceByWords(@Param("word") String word);
}