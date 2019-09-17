package cn.bitzh.service;

import java.util.List;

import cn.bitzh.model.Direction;
import cn.bitzh.model.Major;
import cn.bitzh.model.vo.DirectionChoiceVo;

public interface DirectionService extends BaseService<Direction> {
	List<DirectionChoiceVo> queryDirectionChoiceList();

	List<DirectionChoiceVo> queryDirectionChoiceByWords(String word);

	Integer saveDirection(Direction direction);
}
