package com.gmail.runkevich8.entity;

import java.util.Date;
import java.util.List;

public class Schedule {

    private int id;
    private int busNumber;
    private String locationStart;
    private String locationEnd;
    private int price;
    private Date dateStart;
    private Date dateEnd;
    private List<String> waypoints;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule = (Schedule) o;

        if (id != schedule.id) return false;
        if (busNumber != schedule.busNumber) return false;
        if (price != schedule.price) return false;
        if (locationStart != null ? !locationStart.equals(schedule.locationStart) : schedule.locationStart != null)
            return false;
        if (locationEnd != null ? !locationEnd.equals(schedule.locationEnd) : schedule.locationEnd != null)
            return false;
        if (dateStart != null ? !dateStart.equals(schedule.dateStart) : schedule.dateStart != null) return false;
        if (dateEnd != null ? !dateEnd.equals(schedule.dateEnd) : schedule.dateEnd != null) return false;
        return waypoints != null ? waypoints.equals(schedule.waypoints) : schedule.waypoints == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + busNumber;
        result = 31 * result + (locationStart != null ? locationStart.hashCode() : 0);
        result = 31 * result + (locationEnd != null ? locationEnd.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (dateStart != null ? dateStart.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (waypoints != null ? waypoints.hashCode() : 0);
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public String getLocationStart() {
        return locationStart;
    }

    public void setLocationStart(String locationStart) {
        this.locationStart = locationStart;
    }

    public String getLocationEnd() {
        return locationEnd;
    }

    public void setLocationEnd(String locationEnd) {
        this.locationEnd = locationEnd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public List<String> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<String> waypoints) {
        this.waypoints = waypoints;
    }



    @Override
    public String toString() {

        return id +
                ": номер автобуса : " + busNumber +
                ",от " + locationStart  +
                " - до " + locationEnd  +
                ", цена = " + price +
                ", начало поездки:" + dateStart +
                ", конец = " + dateEnd +
                "\n   путевые точки = " + waypoints + '\n';
    }


}
