package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate expectedDate = LocalDate.parse(LocalDate.of(2023,7,20).toString());
        System.out.println(expectedDate);
    }
}