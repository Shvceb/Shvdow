package cn.bitzh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.Institute;
import cn.bitzh.service.InstituteService;

@Controller
public class InstituteController {
	@Autowired
	private InstituteService instituteService;

	@RequestMapping("/findInstituteAll.action")
	public @ResponseBody List<Institute> findInstituteAll() {
		return instituteService.queryAll();
	}
}
