package cn.bitzh.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class CourseReplaced {
    private Integer id;

    private Integer courseId;

    private Integer replaceCourseId;

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

    public Integer getReplaceCourseId() {
        return replaceCourseId;
    }

    public void setReplaceCourseId(Integer replaceCourseId) {
        this.replaceCourseId = replaceCourseId;
    }
}