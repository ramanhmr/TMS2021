package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    double hardDrive;
    int cycles;
    boolean turnedOn = false;
    boolean burned = false;

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
            System.out.println("Включение...");
            if (cycles > 0 && activation()) {
                turnedOn = true;
                System.out.println("Компьютер включен.");
                off();
            } else {
                System.out.println("Компьютер загорелся и сгорел!");
                burned = true;
            }
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    public boolean activation() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner input;
        while (true) {
            input = new Scanner(System.in);
            if (input.hasNextInt()) {
                int choice = input.nextInt();
                if (choice == 0 || choice == 1) {
                    Random generate = new Random();
                    int rightChoice = generate.nextInt(2);
                    return choice == rightChoice;

                }
            }
            System.out.println("Введите 0 или 1");
        }
    }

    public void off() {
        if (turnedOn) {
            System.out.println("Выключение...");
            turnedOn = false;
            System.out.println("Компьютер выключен.");
            cycles--;
        }
    }
}
