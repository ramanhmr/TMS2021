package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    double hardDrive;
    int cycles;
    boolean turnedOn;
    boolean burned;

    public Computer(String processor, int ram, double hardDrive, int cycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.cycles = cycles;
    }

    public void describe() {
        System.out.println("Характеристики данного компьютера:");
        System.out.println("Процессор: " + processor);
        System.out.println(ram + " Гб оперативной памяти");
        System.out.println("Жесткий диск на " + hardDrive + " Гб");
        System.out.println("Оставшийся ресурс полных циклов работы: " + cycles);
    }

    public void on() {
        if (!burned) {
            if (turnedOn) {
                System.out.println("Компьютер уже включен.");
            } else {
                System.out.println("Включение...");
                if (cycles > 0 && activation()) {
                    turnedOn = true;
                    System.out.println("Компьютер включен.");
                } else {
                    System.out.println("Компьютер загорелся и сгорел!");
                    burned = true;
                }
            }
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    public boolean activation() {
        Scanner input = new Scanner(System.in);
        Random generate = new Random();
        String rightChoice = Integer.toString(generate.nextInt(2));
        while (true) {
            System.out.println("Внимание! Введите 0 или 1");
            String choice = input.next();
            if (choice.equals("0") || choice.equals("1")) {
                return choice.equals(rightChoice);
            }
        }
    }

    public void off() {
        if (turnedOn) {
            System.out.println("Выключение...");
            turnedOn = false;
            System.out.println("Компьютер выключен.");
            System.out.println("Осталось " + --cycles + " циклов работы");
        }
    }
}
