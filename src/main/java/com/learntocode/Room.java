package com.learntocode;

public class Room {
    private Integer numberOfBeds;
    private Double price;
    private boolean dirty;
    private boolean occupied;

    public Room(Integer numberOfBeds, Double price, boolean dirty, boolean occupied) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.dirty = false;
        this.occupied = false;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
