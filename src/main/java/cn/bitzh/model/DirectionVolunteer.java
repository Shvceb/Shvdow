package cn.bitzh.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class DirectionVolunteer {
    private Integer id;

    private String studentId;

    private Integer firstVolunteerId;

    private Integer secondVolunteerId;

    private Integer thirdVolunteerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
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
}