package ru.geekbrains.oop.lesson7.observer;

public class Freelancer implements Observer {

    private String name;
    private int salary;

    public Freelancer(String name) {
        this.name = name;
        salary = 50000;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Фрилансер %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Фрилансер %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}