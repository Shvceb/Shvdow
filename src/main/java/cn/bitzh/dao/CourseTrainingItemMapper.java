package cn.bitzh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.CourseTrainingItem;
import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.CourseTrainingItemVo;
import tk.mybatis.mapper.common.Mapper;

public interface CourseTrainingItemMapper extends Mapper<CourseTrainingItem> {
	Integer insertCourseTrainingItem(@Param("courseId") Integer courseId,
			@Param("trainingItemId") Integer trainingItemId);

	List<CourseTrainingItemVo> selectCourseTrainingItemVoList(MajorDirectionTrainingItem majorDirectionTrainingItem);
}
