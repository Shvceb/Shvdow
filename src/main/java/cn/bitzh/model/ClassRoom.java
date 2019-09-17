package cn.bitzh.model;

import javax.persistence.Id;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-07-19
 */
public class ClassRoom {
	@Id
    private Integer id;

    private String type;

    private Integer roomSize;

    private String atBuilding;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(Integer roomSize) {
        this.roomSize = roomSize;
    }

    public String getAtBuilding() {
        return atBuilding;
    }

    public void setAtBuilding(String atBuilding) {
        this.atBuilding = atBuilding == null ? null : atBuilding.trim();
    }
}