package ru.geekbrains.oop.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary;
    private String jobTitle;

    public Student(String name, String jobTitle){
        this.name = name;
        salary = 5000;
        this.jobTitle = jobTitle;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
