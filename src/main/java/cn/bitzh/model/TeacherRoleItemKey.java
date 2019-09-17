package cn.bitzh.model;

public class TeacherRoleItemKey {
    private String teacherId;

    private Integer teacherRoleId;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public Integer getTeacherRoleId() {
        return teacherRoleId;
    }

    public void setTeacherRoleId(Integer teacherRoleId) {
        this.teacherRoleId = teacherRoleId;
    }
}