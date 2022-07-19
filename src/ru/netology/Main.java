package ru.netology;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();

        Deque<Integer> numbers = new ArrayDeque<>();
        Deque<String> sign = new ArrayDeque<>();

        String[] splited = input.split("\\s+");

        for (int i = 0; i < splited.length; i++) {
            try {
                numbers.offer(Integer.parseInt(splited[i]));
            } catch (NumberFormatException e) {
                sign.push(splited[i]);
            }
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        while (!sign.isEmpty()) {
            System.out.print(sign.pop() + " ");
        }
    }
}
