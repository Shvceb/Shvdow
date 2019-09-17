package cn.bitzh.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bitzh.model.Teacher;
import cn.bitzh.service.TeacherService;
import cn.bitzh.util.JWTUtil;

@Controller
public class TeacherController extends BaseController {
	@Autowired
	private TeacherService teacherService;

	@RequestMapping("/teacherLogin.action")
	public Teacher teacherLogin(Teacher teacher, HttpServletResponse response) {
		Teacher loginTeacher = teacherService.queryOne(teacher);
		if (loginTeacher != null) {
			try {
				ServletOutputStream out = response.getOutputStream();
				String jwt = JWTUtil.createJWT(loginTeacher.getId(), loginTeacher.getName(), 0, "s");
				System.out.println("*************************" + jwt);
				out.write(jwt.getBytes());
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
