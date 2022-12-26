package ru.elenav5.sintacsisjava;

public class Main {
    public static void main(String[] args){
        //8.1. Синтаксические правила
        /*Блок комментариев. Текст может занимать несколько
        строк. Вложение блоков не допускается*/
        //Строка комментариев
        int i=1;
        while (i<=5){
            if(i==2){
                System.out.println("Tea for two.");
            } else System.out.println("Not two");
            i++;
        }

        //8.2 - Простые типы
        //boolean - false, true
        boolean flag1 = false; //false
        boolean flag2 = (6 < 7); //true
        boolean flag3 = !true; //не true = false
        //boolean flag4 = 0; //вызовет ошибку
        System.out.println("flag1:"+ flag1 + ", flag2:" + flag2 + ", flag3:" + flag3);

        //char - 16-битное целое число - символ в формате Unicode
        char c0 = 3;
        char c1 = 'Q';
        char c2 = '\u0000'; //наименьшее значение
        char c3 = '\uFFFF'; //наибольшее значение
        char c4 = '\b'; //пробел
        System.out.println("c0:" + c0 + ", c1:" + c1 + ", c2:" + c2 + ", c3:" + c3 + ", c4:" + c4);

        //bite - 8-битное целое число со знаком (-128 - +127)
        //short - 16-битное целое число (-32768 - +32767)
        //int - 32-битное целое число со знаком
        int i0 = 0;
        int i1 = -12345;
        int i2 = 0xCafeBabe; //шеснатеричное число
        int i3 = 0777; //восьмеричное число
        System.out.println("i0:" + i0 + ", i1:" + i1 + ", i2:" + i2 + ", i3:" + i3);

        //long - 64-битное целое число со знаком
        long l0 = 0L;
        long l1 = -1234l;
        long l2 = 0xBabeL; //шеснатеричное число
        long l3 = -06767l; //восьмеричное число
        System.out.println("l0:" + l0 + ", l1:" + l1 + ", l2:" + l2 + ", l3:" + l3);

        //float - 32-битное число с плавающей точкой
        float f0 = -1.23f;
        float f1 = 6.02E23F; //число 6.02х10 в степени 23
        float f2 = 4.5e-17f; //4.5х10 в степени -17
        System.out.println("f0:" + f0 + ", f1:" + f1 + ", f2:" + f2);

        //double - 64-битное число с плавающей точкой
        double d0 = 1.23;
        double d1 = -4.56f;
        double d2 = 6.02214E+23;
        double d3 = 1e-99;
        System.out.println("d0:" + d0 + ", d1:" + d1 + ", d2:" + d2 + ", d3:" + d3);

        //Преобразование типов:
        int i10 = 3;
        byte b10 = (byte) i10;
        System.out.println("i:" + i10 + ", b:" + b10);

        long x10 = 123456L;
        short s10 = (short) x10; //числа будут разные
        System.out.println("x:" + x10 + ", s:" + s10);

        double d10 = 3.1416;
        float f10 = (float) d10;
        System.out.println("d:" + d10 + ", f:" + f10);

        s10 = (short) f10; //преобразование float в short
        int i11 = s10;
        System.out.println("s:" + s10 + ", i:" + i11);

        //8.3 - операторы, условные операторы и циклы
        //Арифметические операторы:
        //+, - - сложение, вычитание
        //*, /, % - умножение, деление, остаток от деления
        //++, -- - прибавление/вычитание единицы до/после операции
        //<<, >>, >>> - сдвиги с учетом и без учета знака
        //~ - побитовая инверсия
        //&, |, ^ - побитовые операции And, Or, Xor
        //<переменная> <операция> = <переменная>; - псевдокод

        //Логические операторы:
        //==, != - равенство, неравенство
        //<, <=, >, >= - меньше, меньше или равно, больше, больше или равно
        //&&, || - опреации And, Or
        //! - отрицание

        //Условные операторы:
        System.out.println("Условные и логические операторы:");
        //if
        int n1 = 8;
        int n2 = 7;
        int n3 = 15;
        if (n1 > n2){
            System.out.println(n1 + " is larger than " + n2);
        } else {
            System.out.println(n2 + " is larger than " + n1);
        }
        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " is larger than "+ n2 + " and " + n3);
        } else if (n2>n1 && n2>n3){
            System.out.println(n2 + " is larger than "+ n1 + " and " + n3);
        } else {
            System.out.println(n3 + " is larger than "+ n1 + " and " + n2);
        }

        //? - <логическое выражение> ? <если true> : <если false>
        System.out.println((n1>n2) ? n1 : n2); //8

        //switch - switch (выражение) {case значение: выражение 1; break;}
        switch (n1){
            case 0 :
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("Not a single number.");
        }

        //Циклы:
        System.out.println("Циклы (while, do-while, for):");
        //while (условиеПродолжения) {тело цикла;}
        int m = 0;
        while (m <= 5){
            System.out.println("Number m: " + m);
            m++;
        }
        //do {телоЦикла;} while (условиеПродолжения);
        int v = 5;
        do {
            System.out.println("Number v: " + v);
            v--;
        } while (v >= 0);
        //for (инициализация; условиеПродолжения; обновление) {телоЦикла;}
        for(int z = 0; z<=5; z++){
            System.out.println("Number z: " + z);
        }

        //Моделирование процесса падения мяча с большой высоты:
        int time = 0;
        double start = 550.0, drop = 0.0;
        double height = start;
        while (height > 0){
            System.out.println("After " + time +
                    (time==1 ? " second, " : " seconds, ") +
                    "the ball is at " + height + " feet.");
            time++;
            drop = freeFall(time);
            height = start - drop;
        }
        System.out.println("Before " + time + " seconds could " + " expire, the ball hit the ground");
    }
    public static double freeFall(float time){
        return (16.0 * time * time); // вычисление расстояния при свободном падении
    }
}
