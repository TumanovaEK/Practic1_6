package org.example;

import org.example.entity.Car;
import org.example.service.CarService;

import java.util.Scanner;

public class ReplaceCarBrand {
    // Класс для замены марки автомобиля

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для ввода данных

        Car car = new Car(); // Создаем новый объект Car

        System.out.println("Туманова Екатерина Александровна, группа РИБО-02-22, вариант 1, практика1_6");

        System.out.print("Введите марку автомобиля: "); // Просим пользователя ввести марку

        String brand = scanner.nextLine(); // Считываем введенную марку

        car.setBrand(brand); // Устанавливаем введенную марку в объект Car

        CarService carService = new CarService(car); // Создаем объект CarService с переданным объектом Car

        carService.modify(); // Выполняем модификацию марки

        System.out.println("Исходная марка, измененная марка: " + car.getBrand() + ", " + brand);
        // Выводим исходную и измененную марки на экран
    }
}

