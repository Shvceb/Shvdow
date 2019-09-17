package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.CourseTrainingItemMapper;
import cn.bitzh.dao.MajorDirectionTrainingItemMapper;
import cn.bitzh.model.CourseTrainingItem;
import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.CourseTrainingItemVo;
import cn.bitzh.service.CourseTrainingItemService;

@Transactional
@Service("courseTrainingItemService")
public class CourseTrainingItemServiceImpl extends BaseServiceImpl<CourseTrainingItem>
		implements CourseTrainingItemService {

	@Autowired
	private CourseTrainingItemMapper courseTrainingItemMapper;
	@Autowired
	private MajorDirectionTrainingItemMapper majorDirectionTrainingItemMapper;

	@Override
	public Integer removeCourseTrainingItem(CourseTrainingItem courseTrainingItem) {
		// TODO Auto-generated method stub
		int count = 0;
		MajorDirectionTrainingItem majorDirectionTrainingItem = majorDirectionTrainingItemMapper
				.selectByPrimaryKey(courseTrainingItem.getTrainingItemId());
		int trainingId = majorDirectionTrainingItem.getTrainingId();
		if ((trainingId == 4) || (trainingId == 6)) {
			count = courseTrainingItemMapper.delete(courseTrainingItem);
		} else {
			majorDirectionTrainingItem.setDirectionId(null);
			majorDirectionTrainingItem.setId(null);
			List<MajorDirectionTrainingItem> itemList = majorDirectionTrainingItemMapper
					.select(majorDirectionTrainingItem);
			for (MajorDirectionTrainingItem item : itemList) {
				courseTrainingItem.setId(null);
				courseTrainingItem.setTrainingItemId(item.getId());
				courseTrainingItemMapper.delete(courseTrainingItem);
				count++;
			}
		}

		return count;
	}

	@Override
	public List<CourseTrainingItemVo> queryCourseTrainingItemVoList(
			MajorDirectionTrainingItem majorDirectionTrainingItem) {
		// TODO Auto-generated method stub
		return courseTrainingItemMapper.selectCourseTrainingItemVoList(majorDirectionTrainingItem);
	}

}
