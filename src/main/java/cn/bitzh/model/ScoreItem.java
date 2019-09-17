package cn.bitzh.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class ScoreItem {
    private Integer id;

    private Float regularGrade;

    private Float midGrade;

    private Float finalGrade;

    private Float totalMark;

    private Boolean bolFloat;

    private Integer scoreId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getRegularGrade() {
        return regularGrade;
    }

    public void setRegularGrade(Float regularGrade) {
        this.regularGrade = regularGrade;
    }

    public Float getMidGrade() {
        return midGrade;
    }

    public void setMidGrade(Float midGrade) {
        this.midGrade = midGrade;
    }

    public Float getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Float finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Float getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(Float totalMark) {
        this.totalMark = totalMark;
    }

    public Boolean getBolFloat() {
        return bolFloat;
    }

    public void setBolFloat(Boolean bolFloat) {
        this.bolFloat = bolFloat;
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }
}