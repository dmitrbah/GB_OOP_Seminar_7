package ru.geekbrains.oop.lesson7.observer;

public class Vacancy {

    private String companyName;

    private String jobTitle;

    private int salary;

    private boolean status;

    public Vacancy(String companyName, String jobTitle, int salary) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.status = true;
    }

    @Override
    public String toString() {
        return String.format("Вакансия в компании %s; должность %s; предлагаемая зарплата %d", companyName, jobTitle, salary);
    }
}
