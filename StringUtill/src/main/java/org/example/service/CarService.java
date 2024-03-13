package org.example.service;

import org.example.entity.Car;

public class CarService {
    // Класс, предоставляющий сервис по модификации марки автомобиля

    private final Car car; // Экземпляр класса Car

    // Конструктор класса
    public CarService(Car car){
        this.car=car; // Присваиваем переданный объект car экземпляру car в классе
    }

    // Метод для модификации марки автомобиля
    public void modify() {
        // Заменяем символы "a" на "o", "i" на "e" и преобразуем в верхний регистр
        car.setBrand(car.getBrand().replaceAll("a", "o").replaceAll("i", "e").toUpperCase());
    }
}

