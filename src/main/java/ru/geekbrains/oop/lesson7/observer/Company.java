package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Random;

public class Company {

    private Random random = new Random();


    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    private ArrayList<Vacancy> vacancyList;

    private VacancyListGenerator vacancyListGenerator = new VacancyListGenerator();

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.vacancyList = new ArrayList<>();
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

    public void createVacancyList(int vacancyNumber) {
        for (int i = 0; i < vacancyNumber; i++) {
            vacancyList.add(vacancyListGenerator.generateVacancy(name, maxSalary));
        }
    }

    public void showVacancyList() {
        for (Vacancy vacancy : vacancyList) {
            System.out.println(vacancy);
        }
    }


}
