package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer("Intel Pentium P5", 16, 2048, 3);
        pc1.describe();
        pc1.on();
        pc1.describe();
        pc1.on();
        pc1.on();
        pc1.on();
        pc1.describe();
    }
}
