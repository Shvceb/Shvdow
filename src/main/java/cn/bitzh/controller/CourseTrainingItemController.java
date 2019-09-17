package cn.bitzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.CourseTrainingItem;
import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.CourseTrainingItemVo;
import cn.bitzh.service.CourseTrainingItemService;

@Controller
public class CourseTrainingItemController {
	@Autowired
	private CourseTrainingItemService courseTrainingItemService;

	@RequestMapping("/deleteCourseTrainingItem.action")
	public @ResponseBody Integer deleteCourseTrainingItem(CourseTrainingItem courseTrainingItem) {
		return courseTrainingItemService.removeCourseTrainingItem(courseTrainingItem);
	}

	@RequestMapping("/queryCourseTrainingItemAll.action")
	public @ResponseBody List<CourseTrainingItemVo> queryCourseTrainingItemVoList(
			MajorDirectionTrainingItem majorDirectionTrainingItem) {
		return courseTrainingItemService.queryCourseTrainingItemVoList(majorDirectionTrainingItem);
	}
}
