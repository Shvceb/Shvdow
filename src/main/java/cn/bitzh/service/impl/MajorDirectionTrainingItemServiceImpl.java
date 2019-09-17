package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.CourseTrainingItemMapper;
import cn.bitzh.dao.MajorDirectionTrainingItemMapper;
import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.MajorDirectionTrainingItemVo;
import cn.bitzh.service.MajorDirectionTrainingItemService;

@Transactional
@Service("majorDirectionTrainingItemService")
public class MajorDirectionTrainingItemServiceImpl extends BaseServiceImpl<MajorDirectionTrainingItem>
		implements MajorDirectionTrainingItemService {
	@Autowired
	private MajorDirectionTrainingItemMapper majorDirectionTrainingItemMapper;
	@Autowired
	private CourseTrainingItemMapper courseTrainingItemMapper;

	@Override
	public Integer selectToSaveCourseTrainingItem(MajorDirectionTrainingItemVo majorDirectionTrainingItemVo) {
		// TODO Auto-generated method stub
		int trainingId = majorDirectionTrainingItemVo.getTrainingId();
		if ((trainingId == 4) || (trainingId == 6)) {
			List<Integer> idList = majorDirectionTrainingItemMapper.selectIdList(majorDirectionTrainingItemVo);
			for (Integer id : idList) {
				courseTrainingItemMapper.insertCourseTrainingItem(majorDirectionTrainingItemVo.getCourseId(), id);
			}
		} else {
			majorDirectionTrainingItemVo.setDirectionId(null);
			List<Integer> idList = majorDirectionTrainingItemMapper.selectIdList(majorDirectionTrainingItemVo);
			for (Integer id : idList) {
				courseTrainingItemMapper.insertCourseTrainingItem(majorDirectionTrainingItemVo.getCourseId(), id);
			}
		}
		return 1;
	}

}
