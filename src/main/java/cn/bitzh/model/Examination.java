package cn.bitzh.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class Examination {
    private Integer id;

    private String courseExam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseExam() {
        return courseExam;
    }

    public void setCourseExam(String courseExam) {
        this.courseExam = courseExam == null ? null : courseExam.trim();
    }
}