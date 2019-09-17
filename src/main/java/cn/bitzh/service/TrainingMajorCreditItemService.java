package cn.bitzh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.TrainingMajorCreditItem;
import cn.bitzh.model.vo.MajorCreditVo;

public interface TrainingMajorCreditItemService extends BaseService<TrainingMajorCreditItem> {
	Integer modifyCredit(TrainingMajorCreditItem trainingMajorCreditItem);

	List<MajorCreditVo> queryMajorCreditList(int majorId);

}
