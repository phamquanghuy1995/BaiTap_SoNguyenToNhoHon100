package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Số Nguyên Tố Nhỏ Hơn 100 là : ");
        int number = 0;
        while (number < 100) {
            boolean isPrime = true;
            if (number < 2) {
                isPrime = false;
            } else if (number == 2) {
                isPrime = true;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
            number++;
        }

    }
}
