package cn.bitzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.MajorDirectionTrainingItemVo;
import cn.bitzh.service.MajorDirectionTrainingItemService;

public class MajorDirectionTrainingItemController {
	@Autowired
	private MajorDirectionTrainingItemService majorDirectionTrainingItemService;

	@RequestMapping("/addCourseTrainingItem.action")
	public @ResponseBody Integer addCourseTrainingItem(MajorDirectionTrainingItemVo majorDirectionTrainingItemVo) {
		return majorDirectionTrainingItemService.selectToSaveCourseTrainingItem(majorDirectionTrainingItemVo);
	}

}
