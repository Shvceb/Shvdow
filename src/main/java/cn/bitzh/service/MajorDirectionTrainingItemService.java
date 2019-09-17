package cn.bitzh.service;

import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.MajorDirectionTrainingItemVo;

public interface MajorDirectionTrainingItemService extends BaseService<MajorDirectionTrainingItem> {
	Integer selectToSaveCourseTrainingItem(MajorDirectionTrainingItemVo majorDirectionTrainingItemVo);
}
