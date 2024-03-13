package org.example.entity;

public class Car {
    // Класс, представляющий автомобиль

    private String brand; // Поле для хранения марки автомобиля

    // Метод для установки марки автомобиля
    public void setBrand(String brand) {
        this.brand = brand; // Устанавливаем значение марки
    }

    // Метод для получения марки автомобиля
    public String getBrand() {
        return brand; // Возвращаем значение марки
    }
}