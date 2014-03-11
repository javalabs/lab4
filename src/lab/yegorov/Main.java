package lab.yegorov;

import lab1.yegorov.Lab1;
import lab2.yegorov.Lab2;
import lab3.yegorov.Lab3;

/**
 * Created by AdminPC on 02.03.14.
 */

/*
Задание на лабораторную работу:
1.	Предыдущие 3 лабораторные работы (№1, 2, 3) разбить по файлам.
    Каждый класс должен находиться в отдельном файле.
    Каждая лабораторная работа должна находиться в отдельном пакете.
	Общий метод main должен вызывать все тесты.
2.	Придумать задачу и обосновать, почему ее нельзя решить без использования интерфейсов.
*/
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Lab1:");
        Lab1.StartTestLab1(null);

        System.out.println("Lab2:");
        Lab2.StartTestLab2(null);

        System.out.println("Lab3:");
        Lab3.StartTestLab3(null);
    }
}
