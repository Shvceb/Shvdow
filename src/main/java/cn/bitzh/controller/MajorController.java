package cn.bitzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.Major;
import cn.bitzh.model.vo.DirectionChoiceVo;
import cn.bitzh.model.vo.MajorChoiceVo;
import cn.bitzh.service.MajorService;

@Controller
public class MajorController {
	@Autowired
	private MajorService majorService;

	@RequestMapping("/addMajor.action")
	public @ResponseBody Integer addMajor(Major major) {
		return majorService.saveMajor(major);
	}

	@RequestMapping("/deleteMajor.action")
	public @ResponseBody Integer deleteMajor(Integer id) {
		return majorService.removeById(id);
	}

	@RequestMapping("/updateMajorBasic.action")
	public @ResponseBody Integer updateMajarBasic(Major major) {
		return majorService.modifyByOrders(major);
	}

	@RequestMapping("/updateMajorPreNumber.action")
	public @ResponseBody Integer updateMajarPreNumber(Major major) {
		return majorService.modifyByOrders(major);
	}

	@RequestMapping("/updateMajorConcrete.action")
	public Integer updateMajorConcrete(Major major) {
		return majorService.modifyByOrders(major);
	}

	@RequestMapping("/findMajorAll.action")
	public @ResponseBody List<Major> findMajorAll() {
		return majorService.queryAll();
	}

	@RequestMapping("/findMajorChoiceAll.action")
	public @ResponseBody List<MajorChoiceVo> findMajorChoiceAll() {
		return majorService.queryMajorChoiceList();
	}

	@RequestMapping("/findMajorChoiceToSearch.action")
	public @ResponseBody List<MajorChoiceVo> findMajorChoiceToSearch(String word) {
		return majorService.queryMajorChoiceByWords(word);
	}
}
