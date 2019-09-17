package cn.bitzh.model;

import javax.persistence.Id;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class Course {
	@Id
	private Integer id;

	private String courseId;

	private String name;

	private Integer credit;

	private String tip;

	private String term;

	private Integer instituteId;

	private Integer courseTypeId;

	private Integer examinationId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId == null ? null : courseId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip == null ? null : tip.trim();
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term == null ? null : term.trim();
	}

	public Integer getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
	}

	public Integer getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public Integer getExaminationId() {
		return examinationId;
	}

	public void setExaminationId(Integer examinationId) {
		this.examinationId = examinationId;
	}

}