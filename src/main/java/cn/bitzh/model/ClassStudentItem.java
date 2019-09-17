package cn.bitzh.model;

import javax.persistence.Id;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class ClassStudentItem {
	@Id
	private Integer classId;
	@Id
	private String studentId;

	private Boolean now;

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId == null ? null : studentId.trim();
	}

	public Boolean getNow() {
		return now;
	}

	public void setNow(Boolean now) {
		this.now = now;
	}
}