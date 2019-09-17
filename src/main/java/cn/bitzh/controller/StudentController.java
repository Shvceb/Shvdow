package cn.bitzh.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bitzh.model.Student;
import cn.bitzh.model.vo.VolunteerAndResultVo;
import cn.bitzh.service.StudentService;
import cn.bitzh.util.JWTUtil;

@Controller
public class StudentController extends BaseController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("studentLogin.action")
	public Student StudentLogin(Student student, HttpServletResponse response) {
		Student loginStudent = studentService.queryOne(student);
		if (loginStudent != null) {
			try {
				ServletOutputStream out = response.getOutputStream();
				String jwt = JWTUtil.createJWT(loginStudent.getId(), loginStudent.getName(), 0, "s");
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

	@RequestMapping("/findVolterAndResByStudentId.action")
	public @ResponseBody VolunteerAndResultVo findVolterAndResByStudentId() {
		return studentService.queryVolterAndResByStudentId(getStudent().getId());
	}

	@RequestMapping("/findStudent.action")
	public @ResponseBody Student findStudent() {
		return studentService.queryStuOrTerById(getStudent().getId());
	}

	@RequestMapping("/updateStudentMajor.action")
	public @ResponseBody Integer updateStudentMajor(Student student) {
		return studentService.modifyByOrders(student);
	}

	@RequestMapping("/updateStudentDirection.action")
	public @ResponseBody Integer updateStudentDirection(Student student) {
		return studentService.modifyByOrders(student);
	}
}
