package cn.bitzh.service;

import java.util.List;

import cn.bitzh.model.CourseTrainingItem;
import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.CourseTrainingItemVo;

public interface CourseTrainingItemService extends BaseService<CourseTrainingItem> {
	Integer removeCourseTrainingItem(CourseTrainingItem courseTrainingItem);

	List<CourseTrainingItemVo> queryCourseTrainingItemVoList(MajorDirectionTrainingItem majorDirectionTrainingItem);
}
