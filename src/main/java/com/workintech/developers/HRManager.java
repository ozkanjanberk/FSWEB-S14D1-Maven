package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
    }

    public HRManager(int id, String name, int salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    @Override
    public void work() {
        System.out.println("HRManager is working");
        setSalary(getSalary() + 500);
    }

    public void addEmployee(JuniorDeveloper junior) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = junior;
                return;
            }
        }
        System.out.println("Index already occupied");
    }

    public void addEmployee(MidDeveloper mid) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = mid;
                return;
            }
        }
        System.out.println("Index already occupied");
    }

    public void addEmployee(SeniorDeveloper senior) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = senior;
                return;
            }
        }
        System.out.println("Index already occupied");
    }
}