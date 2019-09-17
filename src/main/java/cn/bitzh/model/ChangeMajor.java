package cn.bitzh.model;

import java.util.Date;

import javax.persistence.Id;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class ChangeMajor {
	@Id
    private Integer id;

    private Integer oldInstituteId;

    private Integer oldMajorId;

    private Integer targetInstituteId;

    private Integer targetMajorId;

    private Date createTime;

    private Integer pass;

    private String teacherId;

    private String studentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOldInstituteId() {
        return oldInstituteId;
    }

    public void setOldInstituteId(Integer oldInstituteId) {
        this.oldInstituteId = oldInstituteId;
    }

    public Integer getOldMajorId() {
        return oldMajorId;
    }

    public void setOldMajorId(Integer oldMajorId) {
        this.oldMajorId = oldMajorId;
    }

    public Integer getTargetInstituteId() {
        return targetInstituteId;
    }

    public void setTargetInstituteId(Integer targetInstituteId) {
        this.targetInstituteId = targetInstituteId;
    }

    public Integer getTargetMajorId() {
        return targetMajorId;
    }

    public void setTargetMajorId(Integer targetMajorId) {
        this.targetMajorId = targetMajorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }
}