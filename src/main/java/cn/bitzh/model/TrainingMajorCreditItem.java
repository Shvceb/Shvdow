package cn.bitzh.model;

import javax.persistence.Id;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-31
 */
public class TrainingMajorCreditItem {
	@Id
	private Integer id;

	private Integer majorId;

	private Integer trainingId;

	private String credit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMajorId() {
		return majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit == null ? null : credit.trim();
	}
}