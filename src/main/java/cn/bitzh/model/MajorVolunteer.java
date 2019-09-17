package cn.bitzh.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class MajorVolunteer {
    private Integer id;

    private Integer firstVolunteerId;

    private Integer secondVolunteerId;

    private Integer thirdVolunteerId;

    private String studentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirstVolunteerId() {
        return firstVolunteerId;
    }

    public void setFirstVolunteerId(Integer firstVolunteerId) {
        this.firstVolunteerId = firstVolunteerId;
    }

    public Integer getSecondVolunteerId() {
        return secondVolunteerId;
    }

    public void setSecondVolunteerId(Integer secondVolunteerId) {
        this.secondVolunteerId = secondVolunteerId;
    }

    public Integer getThirdVolunteerId() {
        return thirdVolunteerId;
    }

    public void setThirdVolunteerId(Integer thirdVolunteerId) {
        this.thirdVolunteerId = thirdVolunteerId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }
}