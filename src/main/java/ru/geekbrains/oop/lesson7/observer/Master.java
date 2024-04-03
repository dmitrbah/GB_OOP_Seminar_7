package ru.geekbrains.oop.lesson7.observer;

public class Master implements Observer{

    private String name;
    private int salary;
    private String jobTitle;

    public Master(String name, String jobTitle){
        this.name = name;
        salary = 80000;
        this.jobTitle = jobTitle;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
