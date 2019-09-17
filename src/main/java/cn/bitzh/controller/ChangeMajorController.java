package cn.bitzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.ChangeMajor;
import cn.bitzh.service.ChangeMajorService;

@Controller
public class ChangeMajorController extends BaseController {
	@Autowired
	private ChangeMajorService changeMajorService;

	@RequestMapping("/changeMajor.action")
	public @ResponseBody Integer changeMajor(ChangeMajor changeMajor) {
		changeMajor.setStudentId(getStudent().getId());
		return changeMajorService.save(changeMajor);
	}

	@RequestMapping("/checkChangeMajor.action")
	public @ResponseBody Integer checkChangeMajor(ChangeMajor changeMajor) {
		return changeMajorService.modifyByOrders(changeMajor);
	}

	@RequestMapping("/findChangeMajorToCheck.action")
	public @ResponseBody List<ChangeMajor> findChangeMajorToCheck() {
		return changeMajorService.queryChangeMajorToCheck();
	}

	@RequestMapping("/findChangeMajorCheckHistory.action")
	public @ResponseBody List<ChangeMajor> findChangeMajorCheckHistory() {
		return changeMajorService.queryChangeMajorCheckHistory();
	}

	@RequestMapping("/findChangeMajorAllByStudentId.action")
	public @ResponseBody List<ChangeMajor> findChangeMajorAllByStudentId() {
		return changeMajorService.queryChangeMajorListByStudentId(getStudent().getId());
	}

}
