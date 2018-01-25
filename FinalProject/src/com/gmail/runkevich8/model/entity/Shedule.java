package com.gmail.runkevich8.model.entity;

import java.util.Date;
import java.util.List;

public class Shedule {

    private int id;
    private int busNumber;
    private String locationStart;
    private String locationEnd;
    private int price;
    private Date dateStart;
    private Date dateEnd;
    private List<String> waypoints;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shedule shedule = (Shedule) o;

        if (id != shedule.id) return false;
        if (busNumber != shedule.busNumber) return false;
        if (price != shedule.price) return false;
        if (locationStart != null ? !locationStart.equals(shedule.locationStart) : shedule.locationStart != null)
            return false;
        if (locationEnd != null ? !locationEnd.equals(shedule.locationEnd) : shedule.locationEnd != null) return false;
        if (dateStart != null ? !dateStart.equals(shedule.dateStart) : shedule.dateStart != null) return false;
        if (dateEnd != null ? !dateEnd.equals(shedule.dateEnd) : shedule.dateEnd != null) return false;
        return waypoints != null ? waypoints.equals(shedule.waypoints) : shedule.waypoints == null;
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

    @Override
    public String toString() {
        return "Shedule{" +
                "id=" + id +
                ", busNumber=" + busNumber +
                ", locationStart='" + locationStart + '\'' +
                ", locationEnd='" + locationEnd + '\'' +
                ", price=" + price +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", waypoints=" + waypoints +
                '}';
    }




}
