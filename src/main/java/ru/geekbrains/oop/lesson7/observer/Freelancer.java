package ru.geekbrains.oop.lesson7.observer;

public class Freelancer implements Observer {

    private String name;
    private int salary;
    private String jobTitle;
    private static boolean hiredStatus = true;

    public Freelancer(String name, String jobTitle) {
        this.name = name;
        salary = 50000;
        this.jobTitle = jobTitle;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (hiredStatus && this.salary <= vacancy.getSalary() && vacancy.isStatus() && this.jobTitle.equals(vacancy.getJobTitle())){
            System.out.printf("Фрилансер %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
            vacancy.setStatus(false);
            hiredStatus = false;
        } else if (!hiredStatus) {
            System.out.printf("Фрилансер %s: Я уже нанят!)\n", name);
        } else {
            System.out.printf("Фрилансер %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), salary);
        }
    }

    @Override
    public boolean isStatus() {
        return hiredStatus;
    }

    @Override
    public String toString() {
        return String.format("Соискатель фрилансер %s; должность %s; ожидаемая зарплата %d",
                name, jobTitle, salary);
    }


}
