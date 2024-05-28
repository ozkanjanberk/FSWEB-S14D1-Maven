package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("MidDeveloper is working");
        setSalary(getSalary() + 200);
    }
}
