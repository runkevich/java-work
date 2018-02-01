package com.gmail.runkevich8.entity;

import java.text.SimpleDateFormat;
import java.util.*;

public class Root {

    private String name;
    private Date date;
    private List<Schedule> schedule;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Root root = (Root) o;

        if (name != null ? !name.equals(root.name) : root.name != null) return false;
        if (date != null ? !date.equals(root.date) : root.date != null) return false;
        return schedule != null ? schedule.equals(root.schedule) : root.schedule == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (schedule != null ? schedule.hashCode() : 0);
        return result;
    }

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

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    //Поиск автобуса по введенному номеру
    public void findNumberBus(int number) {

        boolean finder = false;
        for (Schedule s : schedule) {
            if (s.getBusNumber() == number) {
                finder = true;
                System.out.println(s);
            }
        } if (!finder) {
            System.out.println("Автобусов с таким номером не найдено.");
       }
    }

    //поиск по цене поездки c использованием iterator
    public void findPrice(int price) {

        boolean finder = false;
        for (Schedule s : schedule) {
            if (s.getPrice() == price) {
                finder = true;
                System.out.println(s);
            }
        } if (!finder) {
            System.out.println("Автобусов с таким номером не найдено.");
        }
    }

    //поиск по дате отправления
    public void findDateStart(String dateStart) {
        boolean finder = false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for (int j = 0; j < getSchedule().size(); j++) {
            String birthDate = sdf.format(schedule.get(j).getDateStart());
            if (birthDate.equals(dateStart)) {
                finder = true;
                System.out.println(schedule.get(j));
            }
        }
        if (!finder) {
            System.out.println("Автобусов с такой датой отпраления не существует.");
        }
    }

    //информация  длительности поездки
    public void findCurrent() {

        GregorianCalendar calendarTemp = new GregorianCalendar();

        long averageTimeEnd = 0;
        long averageTimeStart = 0;
        for (int j = 0; j < getSchedule().size(); j++) {
            averageTimeEnd = schedule.get(j).getDateEnd().getTime();
            averageTimeStart = schedule.get(j).getDateStart().getTime();
            long averageTime = averageTimeEnd - averageTimeStart;
            calendarTemp.setTime(new Date(averageTime));
            System.out.println(averageTime);
        }
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", schedule=" + schedule +
                '}';
    }

}
