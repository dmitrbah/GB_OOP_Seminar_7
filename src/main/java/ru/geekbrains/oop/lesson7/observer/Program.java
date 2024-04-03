package ru.geekbrains.oop.lesson7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();

        Company google = new Company("Google", publisher, 120000);
//        Company yandex = new Company("Yandex", publisher, 95000);
//        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student = new Student("Student #1", "Программист");
//        Master master1 = new Master("Master #1");
//        Freelancer freelancer1 = new Freelancer("Freelancer #1");

        publisher.registerObserver(student);
//        publisher.registerObserver(master1);
//        publisher.registerObserver(freelancer1);

        google.createVacancyList(3);
        google.showVacancyList();

        for (int i = 0; i < 3; i++){
            google.needEmployee();
//            yandex.needEmployee();
//            geekBrains.needEmployee();
        }

    }

}
