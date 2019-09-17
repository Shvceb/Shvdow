package cn.bitzh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import cn.bitzh.model.Student;
import cn.bitzh.model.Teacher;
import cn.bitzh.util.JWTUtil;

import io.jsonwebtoken.Claims;

public class BaseController {
	@Autowired
	protected HttpServletRequest request;

	public Teacher getTeacher() {

		Teacher teacher = new Teacher();
		String httpHeader = request.getHeader("Authorization");
		Claims claims = JWTUtil.parseJWT(httpHeader);
		String name = claims.get("Name").toString();
		String userId = claims.get("userId").toString();
		teacher.setName(name);
		teacher.setId(userId);
		return teacher;
	}

	public Student getStudent() {
		Student student = new Student();
		String httpHeader = request.getHeader("Authorization");
		Claims claims = JWTUtil.parseJWT(httpHeader);
		String name = claims.get("Name").toString();
		String userId = claims.get("userId").toString();
		student.setName(name);
		student.setId(userId);
		return student;
	}

}
