package cn.bitzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.Direction;
import cn.bitzh.model.Major;
import cn.bitzh.model.vo.DirectionChoiceVo;
import cn.bitzh.model.vo.MajorChoiceVo;
import cn.bitzh.service.DirectionService;

@Controller
public class DirectionController {
	@Autowired
	private DirectionService directionService;

	@RequestMapping("/addDirection.action")
	public @ResponseBody Integer addDirection(Direction direction) {
		return directionService.saveDirection(direction);
	}

	@RequestMapping("/deleteDirection.action")
	public @ResponseBody Integer deleteDirection(Integer id) {
		return directionService.removeById(id);
	}

	@RequestMapping("/updateDirectionBasic.action")
	public @ResponseBody Integer updateDirectionBasic(Direction direction) {
		return directionService.modifyByOrders(direction);
	}

	@RequestMapping("/updateDirectionPreNumber.action")
	public @ResponseBody Integer updateMajarPreNumber(Direction direction) {
		return directionService.modifyByOrders(direction);
	}

	@RequestMapping("/findDirectionAllByMajorId.action")
	public @ResponseBody List<Direction> findDirectionAllByMajorId(Direction direction) {
		return directionService.queryListByOrders(direction);
	}

	@RequestMapping("/findDirectionChoiceAll.action")
	public @ResponseBody List<DirectionChoiceVo> findDirectionChoiceAll() {
		return directionService.queryDirectionChoiceList();
	}

	@RequestMapping("/findDirectionChoiceToSearch.action")
	public @ResponseBody List<DirectionChoiceVo> findDirectionChoiceToSearch(String word) {
		return directionService.queryDirectionChoiceByWords(word);
	}

}
