package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.DirectionMapper;
import cn.bitzh.dao.MajorDirectionTrainingItemMapper;
import cn.bitzh.model.Direction;
import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.DirectionChoiceVo;
import cn.bitzh.service.DirectionService;

@Transactional
@Service("directionService")
public class DirectionServiceImpl extends BaseServiceImpl<Direction> implements DirectionService {
	@Autowired
	private DirectionMapper directionMapper;
	@Autowired
	private MajorDirectionTrainingItemMapper majorDirectionTrainingItemMapper;

	@Override
	public List<DirectionChoiceVo> queryDirectionChoiceList() {
		// TODO Auto-generated method stub
		return directionMapper.selectDirectionChoiceList();
	}

	@Override
	public List<DirectionChoiceVo> queryDirectionChoiceByWords(String word) {
		// TODO Auto-generated method stub
		return directionMapper.selectDirectionChoiceByWords(word);
	}

	@Override
	public Integer saveDirection(Direction direction) {
		// TODO Auto-generated method stub
		int count = directionMapper.insert(direction);
		if (count > 0) {
			int id = direction.getId();
			count += majorDirectionTrainingItemMapper.insertTrainingItemByDirection(direction.getMajorId(), id, 4);
			count += majorDirectionTrainingItemMapper.insertTrainingItemByDirection(direction.getMajorId(), id, 6);

		}
		return count;
	}

}
