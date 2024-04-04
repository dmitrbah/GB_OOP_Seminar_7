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

    public int getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (status) {
            return String.format("Открытая вакансия в компании %s; должность %s; предлагаемая зарплата %d", companyName, jobTitle, salary);
        } else {
            return String.format("Закрытая вакансия в компании %s; должность %s; предлагаемая зарплата %d", companyName, jobTitle, salary);
        }
    }
}
