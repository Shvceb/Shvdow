package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.TrainingMajorCreditItemMapper;
import cn.bitzh.model.TrainingMajorCreditItem;
import cn.bitzh.model.vo.MajorCreditVo;
import cn.bitzh.service.TrainingMajorCreditItemService;

@Transactional
@Service("trainingMajorCreditItemService")
public class TrainingMajorCreditItemServiceImpl extends BaseServiceImpl<TrainingMajorCreditItem>
		implements TrainingMajorCreditItemService {

	@Autowired
	private TrainingMajorCreditItemMapper trainingMajorCreditItemMapper;

	@Override
	public List<MajorCreditVo> queryMajorCreditList(int majorId) {
		// TODO Auto-generated method stub
		return trainingMajorCreditItemMapper.selectMajorCreditList(majorId);
	}

	@Override
	public Integer modifyCredit(TrainingMajorCreditItem trainingMajorCreditItem) {
		// TODO Auto-generated method stub
		return trainingMajorCreditItemMapper.updateMajorCredit(trainingMajorCreditItem);
	}

}
