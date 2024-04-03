package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class VacancyListGenerator {

    Random random = new Random();

    public Vacancy generateVacancy(String companyName, int maxSalary) {
        int salary = random.nextInt(maxSalary);
        return new Vacancy(companyName, salary);
    }

}
