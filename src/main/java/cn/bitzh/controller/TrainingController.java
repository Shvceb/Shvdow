package cn.bitzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.Training;
import cn.bitzh.service.TrainingService;

@Controller
public class TrainingController {
	@Autowired
	private TrainingService trainingService;

	@RequestMapping("/findTrainingAll.action")
	public @ResponseBody List<Training> findTrainingAll() {
		return trainingService.queryAll();
	}
}
