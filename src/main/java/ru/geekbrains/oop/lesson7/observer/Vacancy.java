package ru.geekbrains.oop.lesson7.observer;

public class Vacancy {

    private String companyName;

    private int salary;

    private boolean status;

    public Vacancy(String companyName, int salary) {
        this.companyName = companyName;
        this.salary = salary;
        this.status = true;
    }

    @Override
    public String toString() {
        return String.format("Вакансия в компании %s; предлагаемая зарплата %d", companyName, salary);
    }
}