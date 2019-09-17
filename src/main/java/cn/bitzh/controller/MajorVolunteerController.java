package cn.bitzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.MajorVolunteer;
import cn.bitzh.model.vo.VolunteerNameVo;
import cn.bitzh.service.MajorVolunteerService;

@Controller
public class MajorVolunteerController extends BaseController {
	@Autowired
	private MajorVolunteerService majorVolunteerService;

	@RequestMapping("/addMajorVolunteer.action")
	public @ResponseBody Integer addMajorVolunteer(MajorVolunteer majorVolunteer) {
		majorVolunteer.setStudentId(getStudent().getId());
		return majorVolunteerService.save(majorVolunteer);
	}

	@RequestMapping("/findMajorVolunteerByStudentId.action")
	public @ResponseBody VolunteerNameVo findVolunteerNameByStudentId(String studentId) {
		return majorVolunteerService.queryVolunteerNameByStudentId(studentId);
	}

}
