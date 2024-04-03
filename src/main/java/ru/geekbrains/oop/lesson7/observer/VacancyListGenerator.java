package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

public class VacancyListGenerator {

    Random random = new Random();
    private String[] jobTitles = new String[]{"Программист", "Инженер", "Уборщик"};

    public Vacancy generateVacancy(String companyName, int maxSalary) {
        int salary = random.nextInt(5000, maxSalary);
        String jobTitle = jobTitles[random.nextInt(jobTitles.length)];
        return new Vacancy(companyName, jobTitle, salary);
    }

}
