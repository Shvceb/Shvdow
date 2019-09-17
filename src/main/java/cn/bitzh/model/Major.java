package cn.bitzh.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class Major {
	@Id
	@GeneratedValue(generator = "JDBC")
	private Integer id;

	private String majorId;

	private String name;

	private Integer preNumber;

	private Integer actualNumber;

	private String majorDescribe;

	private String majorTarget;

	private String requirement;

	private String coreCourse;

	private String directionFit;

	private String creditAsk;

	private Integer instituteId;

	private Integer trainingId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId == null ? null : majorId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getPreNumber() {
		return preNumber;
	}

	public void setPreNumber(Integer preNumber) {
		this.preNumber = preNumber;
	}

	public Integer getActualNumber() {
		return actualNumber;
	}

	public void setActualNumber(Integer actualNumber) {
		this.actualNumber = actualNumber;
	}

	public String getMajorDescribe() {
		return majorDescribe;
	}

	public void setMajorDescribe(String majorDescribe) {
		this.majorDescribe = majorDescribe;
	}

	public String getMajorTarget() {
		return majorTarget;
	}

	public void setMajorTarget(String majorTarget) {
		this.majorTarget = majorTarget == null ? null : majorTarget.trim();
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement == null ? null : requirement.trim();
	}

	public String getCoreCourse() {
		return coreCourse;
	}

	public void setCoreCourse(String coreCourse) {
		this.coreCourse = coreCourse == null ? null : coreCourse.trim();
	}

	public String getDirectionFit() {
		return directionFit;
	}

	public void setDirectionFit(String directionFit) {
		this.directionFit = directionFit == null ? null : directionFit.trim();
	}

	public String getCreditAsk() {
		return creditAsk;
	}

	public void setCreditAsk(String creditAsk) {
		this.creditAsk = creditAsk == null ? null : creditAsk.trim();
	}

	public Integer getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}
}