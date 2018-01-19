package com.gmail.runkevich8.Task1;

public interface MyCollectionContract<Department, Staff> {

    //функционал для добавления директора
    void setDirector(Staff director);
    Staff getDirector();
    void removeDirector();

    //функционал для добавления отделов
    void addDepartment(Department department);
    void removeDepartment(Department department);

    //функционал для добавления сотрудниов
    void addStaff(Staff staff, Department department);
    void removeStaff(Staff staff, Department department);
    void moveStaff(Staff staff, Department departmentOut,
                   Department departmentIn);

}
