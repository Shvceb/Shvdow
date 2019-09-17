package cn.bitzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.DirectionVolunteer;
import cn.bitzh.model.vo.VolunteerNameVo;
import cn.bitzh.service.DirectionVolunteerService;

@Controller
public class DirectionVolunteerController extends BaseController {
	@Autowired
	private DirectionVolunteerService directionVolunteerService;

	@RequestMapping("/addDirectionVolunteer.action")
	public @ResponseBody Integer addDirectionVolunteer(DirectionVolunteer directionVolunteer) {
		directionVolunteer.setStudentId(getStudent().getId());
		return directionVolunteerService.save(directionVolunteer);
	}

	@RequestMapping("/findDirectionVolunteerByStudentId.action")
	public @ResponseBody VolunteerNameVo findVolunteerNameByStudentId(String studentId) {
		return directionVolunteerService.queryVolunteerNameByStudentId(studentId);
	}
}
