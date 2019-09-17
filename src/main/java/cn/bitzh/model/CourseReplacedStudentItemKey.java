package cn.bitzh.model;

public class CourseReplacedStudentItemKey {
    private String studentId;

    private Integer replacedId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getReplacedId() {
        return replacedId;
    }

    public void setReplacedId(Integer replacedId) {
        this.replacedId = replacedId;
    }
}