package com.gmail.runkevich8.model.entity;


import java.util.Date;
import java.util.List;

public class Root {

    private String name;
    private Date date;
   private List<Schedule> schedules;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Root root = (Root) o;

        if (name != null ? !name.equals(root.name) : root.name != null) return false;
        if (date != null ? !date.equals(root.date) : root.date != null) return false;
        return schedules != null ? schedules.equals(root.schedules) : root.schedules == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (schedules != null ? schedules.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", schedules=" + schedules +
                '}';
    }
}
