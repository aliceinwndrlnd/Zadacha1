package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите любое целое число");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i <= 9 && i >= 0) {
            System.out.println("Веденное число однозначное и положительное");
        }
        else if (i >=10 && i <=99) {
            System.out.println("Введенное число двузначное и положительное");
        }
        else if (i >= -99 && i <= -10) {
            System.out.println("Введенное число двузначное и отрицательное");
        }
        else if (i >= -9 && i <= 0) {
            System.out.println("Введенное число однозначное и отрицательное");
        }
        else {
            System.out.println("Введенное число трехзначное или более");
        }

        }

    }

