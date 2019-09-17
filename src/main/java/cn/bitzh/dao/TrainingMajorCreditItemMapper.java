package cn.bitzh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.TrainingMajorCreditItem;
import cn.bitzh.model.vo.MajorCreditVo;
import tk.mybatis.mapper.common.Mapper;

public interface TrainingMajorCreditItemMapper extends Mapper<TrainingMajorCreditItem> {
	Integer updateMajorCredit(@Param("trainingMajorCreditItem") TrainingMajorCreditItem trainingMajorCreditItem);

	List<MajorCreditVo> selectMajorCreditList(@Param("majorId") int majorId);

	Integer insertTrainingMajorCreditItem(@Param("majorId") int majorId, @Param("trainingId") int trainingId);
}