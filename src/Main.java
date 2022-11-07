public class Main {
    public static void main(String[] args) {
        // Домашнее задание -1
        // Задание 1
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++){
            System.out.println("Итерация цикла % " + i);
        }
        System.out.println();


        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 0; i--){
            System.out.println("Итерация цикла % " + i);
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i <=17; i=i+2){
            System.out.println("Четные числа - "+ i);
        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i>= -10; i--) {
            System.out.println("От больщего к меньшему " + i);
        }
        System.out.println();

        // Задача с високосным годом
        System.out.println("Задача с високосным годом");
        for (int i = 2020; i<2030; i=i+4) {
            System.out.println("Високосный год - " + i);
        }
        System.out.println();

        // Домашнее задание 2
        // Задание 1
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        for (int i = 1904; i<=2096; i=i+4){
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i<= 98; i=i+7){
            System.out.println(i);
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 1; i<=512; i=i*2){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача с вычислениями");
        // Задача с вычислениями
        int salary = 65535;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого - "+ total);
        }
        System.out.println();

        // Домашнее задание 3
        // Задание 1
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        int money = 29000;
        int total1= 0;
        for (int i = 1; i < 13; i++) {
            total1 = total1 + money;
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int money1 = 29000;
        int total2= 0;
        for (int i = 1; i < 13; i++) {
            total2 = total2 + total2/100;
            total2 = total2 + money1;
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println();


    }
}