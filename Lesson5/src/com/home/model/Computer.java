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
        if (burned) {
            System.out.println("Этот компьютер сгорел.");
        } else {
            System.out.println("Характеристики данного компьютера:");
            System.out.println("Процессор: " + processor);
            System.out.println(ram + " Гб оперативной памяти");
            System.out.println("Жесткий диск на " + hardDrive + " Гб");
            System.out.println("Оставшийся ресурс полных циклов работы: " + cycles);
        }

    }

    public boolean on() {
        if (!burned) {
            if (cycles > 0 && activation()) {
                turnedOn = true;
                off();
                return true;
            } else {
                System.out.println("Компьютер загорелся и сгорел!");
                burned = true;
                return false;
            }
        } else {
            System.out.println("Компьютер сгорел!");
            return false;
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

    public boolean off() {
        if (turnedOn) {
            turnedOn = false;
            cycles--;
            return true;
        }
        return false;
    }
}
