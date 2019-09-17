package cn.bitzh.model;

import javax.persistence.Id;

public class CourseTrainingItem {
	@Id
	private Integer id;
	private Integer courseId;
	private Integer trainingItemId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getTrainingItemId() {
		return trainingItemId;
	}

	public void setTrainingItemId(Integer trainingItemId) {
		this.trainingItemId = trainingItemId;
	}

}
