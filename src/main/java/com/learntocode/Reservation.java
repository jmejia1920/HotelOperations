package com.learntocode;

public class Reservation {
    private boolean roomType;
    private Integer roomPrice;
    private Integer numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, Integer roomPrice, Integer numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public boolean getRoomType() {
        return roomType;
    }

    public void setRoomType(boolean roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Integer roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Integer getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(Integer numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
