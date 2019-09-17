package cn.bitzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.TrainingMajorCreditItem;
import cn.bitzh.model.vo.MajorCreditVo;
import cn.bitzh.service.TrainingMajorCreditItemService;

@Controller
public class TrainingMajorCreditItemController {

	@Autowired
	private TrainingMajorCreditItemService trainingMajorCreditItemService;

	@RequestMapping("/addTrainingMajorCreditItem.action")
	public @ResponseBody Integer addTrainingMajorCreditItem(TrainingMajorCreditItem trainingMajorCreditItem) {
		return trainingMajorCreditItemService.modifyCredit(trainingMajorCreditItem);
	}

	@RequestMapping("/updateTrainingMajorCreditItem.action")
	public @ResponseBody Integer updateTrainingMajorCreditItem(TrainingMajorCreditItem trainingMajorCreditItem) {
		return trainingMajorCreditItemService.modifyCredit(trainingMajorCreditItem);
	}

	@RequestMapping("/findMajorCreditList.action")
	public @ResponseBody List<MajorCreditVo> findMajorCreditList(int id) {
		return trainingMajorCreditItemService.queryMajorCreditList(id);
	}
}
