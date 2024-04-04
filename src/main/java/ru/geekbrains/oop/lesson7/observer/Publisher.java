package ru.geekbrains.oop.lesson7.observer;

public interface Publisher {

    void sendOffer(Vacancy vacancy);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void showObserversList();


}
