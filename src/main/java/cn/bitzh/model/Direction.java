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
public class Direction {
	@Id
	@GeneratedValue(generator = "JDBC")
	private Integer id;

	private String directionId;

	private String name;

	private String directionDescribe;

	private Integer preNumber;

	private Integer actualNumber;

	private Integer majorId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDirectionId() {
		return directionId;
	}

	public void setDirectionId(String directionId) {
		this.directionId = directionId == null ? null : directionId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getDirectionDescribe() {
		return directionDescribe;
	}

	public void setDirectionDescribe(String directionDescribe) {
		this.directionDescribe = directionDescribe;
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

	public Integer getMajorId() {
		return majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}
}