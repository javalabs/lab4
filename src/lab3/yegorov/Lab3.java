package lab3.yegorov;

/**
 * Created by AdminPC on 14.02.14.
 */

/*

1.	Разработать в программе следующие классы:
- класс, содержащий функцию main;
- класс для методов основной программы (методы должны содержать решение задачи по номеру своего варианта;
в основном методе должны быть использованы условия и циклы);
- класс для методов тестирования, производный от класса основной программы
(методы тестирования должны реализовывать тестирование методов основной программы;
в методах тестирования должны быть протестированы все крайние случаи работы программы).
2. 	Создать объекты классов программы и тестирования в функции main().
3.	Выполнить и протестировать программу.


Винни-Пух на каждый свой день рождения съедает столько еды, сколько съел на двух предыдущих вместе.
На первых двух днях он съел по M граммов.
Нужно узнать, сколь граммов еды он съест на N-й день рождения...

 */

public class Lab3 {
    public static void StartTestLab3(String args[]) {
        Task t1, t2, t3;
        t1 = new Task(5.0, 7);
        t2 = new Task(3.2, 7);
        t3 = new Task(1.0, 7);
        System.out.println("Task1 = " + t1.answer());
        System.out.println("Task2 = " + t2.answer());
        System.out.println("Task3 = " + t3.answer());

        TestTask test1, test2, test3;
        test1 = new TestTask(5.0, 7, 65);
        test2 = new TestTask(3.2, 7, 40);
        test3 = new TestTask(1.0, 7, 13);
        test1.testMethod();
        test2.testMethod();
        test3.testMethod();
    }
}
