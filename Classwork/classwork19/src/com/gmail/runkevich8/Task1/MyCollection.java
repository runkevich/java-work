package com.gmail.runkevich8.Task1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyCollection<Department, Staff> implements
        MyCollectionContract<Department, Staff>{

    private Staff director;
   // private Department department;
    private Map<Department,List<Staff>> staff = new HashMap<>();



    @Override
    public void setDirector(Staff director) {
        this.director = director;
    }

    @Override
    public Staff getDirector() {
        return null;
    }

    @Override
    public void removeDirector() {
        director = null;
    }

    @Override
    public void addDepartment(Department department) {
        staff.put(department, new ArrayList<Staff>());
    }

    @Override
    public void removeDepartment(Department department) {
        staff.remove(department);
    }

    @Override
    public void addStaff(Staff staff, Department department) {
        this.staff.get(department).add(staff);
    }

    @Override
    public void removeStaff(Staff staff, Department department) {
        this.staff.get(department).remove(staff);
    }

    @Override
    public void moveStaff(Staff staff, Department departmentOut, Department departmentIn) {
        removeStaff(staff,departmentOut);
        addStaff(staff,departmentIn);
    }


    //<MySuperValue extends Number,R extends String> {
//    //в скобках может быть что угодн
//    // обязательно только extends
//
//    private MySuperValue value;
//    private R value2;
//
//    public MySuperValue getValue() {
//        return value;
//    }
//
//    public void setValue(MySuperValue value) {
//        this.value = value;
//    }
//
//    public void setValue2(R value2) {
//        this.value2 = value2;
//    }
//
//    public R getValue2() {
//        return value2;
//    }
}
