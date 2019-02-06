package com.itschool;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Na_yroke_4_Example_1();
        Na_yroke_4_Example_2();
        Na_yroke_4_Example_3();
        Na_yroke_4_Example_4();
        Na_yroke_4_Example_5();
        Na_yroke_4_Example_6();
        Na_yroke_4_Example_7();
        Na_yroke_4_Example_8();
    }
    private static void Na_yroke_4_Example_1(){
        System.out.println(" Example_1  -  Программа определяет в каком банке выгодней обменять доллары на гривны при известных курсах.");
        int pok = 0;
        int pro = 1;
        int maX = 0;
        int[] PrivatBank = {28, 30};
        int[] AlfaBank = {26, 28};
        int[] AvalBank = {27, 29};
        String[] nBank = {"AvalBank", "AlfaBank", "PrivatBank"};
        int[] Banks[] = {AvalBank, AlfaBank, PrivatBank};
        System.out.println("      Курс доллара:\n\n  Банк    Покупка   Продажа");
        for (int N = 0; N < Banks.length; N++){
            System.out.println(nBank[N]+"    "+Banks[N][pok]+"     "+Banks[N][pro]);
            if (Banks[maX][pok] < Banks[N][pok]) maX = N;
        }
        System.out.println("\n\nCудя из выше представленных показателей \nДоллары на сегодняшний день выгодней менять на гривны в "+nBank[maX]+" по курсу "+Banks[maX][pok]);
    }
    private static void Na_yroke_4_Example_2(){
        System.out.println("\n\n Example_2  -  Программа из массива с колличеством єлементов 'n' выводит только те элементы индексы которых являються степенями двойки:");
        int k = 2;
        int n = 10000;
        int[] a = new int[n];
        // Заполним массив а элементами равными индексу (для более понятного результата)
        for (int i = 0; i < a.length; i++){
            a[i] = i;
        }
        // Выведем значение элементов по заданным индексам
        for (int i = 1; i < a.length; i =i*k) {
            if (i != 1) System.out.print(", ");
            System.out.print(a[i]);
        }
        System.out.println(".");
    }
    private static void Na_yroke_4_Example_3(){
        System.out.println("\n\n Example_3  -  Программа находит сумму четных элементов целочисленного массива: ");
        int k = 2;
        int sumChet = 0;
        int[] y = {32, 9, 53, 86, 65, 27, 16, 84, 90, 2};
        for (int i = 0; i < y.length; i++){
            if (i == 0) System.out.print("Заданный целочисленный массив y ={"+y[i]);
            else System.out.print(", "+y[i]);
            if ((y[i]%k) == 0) sumChet += y[i];
            if(i == (y.length - 1)) System.out.println("};");
        }
        System.out.println("\n Сумма четных элементов массива равна: "+sumChet);
    }
    private static void Na_yroke_4_Example_4(){
        System.out.println("\n\n Example_4  -  Программа вычисляет произведение всех элементов целочисленного массива кратных 9 :");
        int k = 9;
        int proKrat = 1;
        int[] x = {32, 9, 53, 86, 65, 27, 16, 84, 90, 2};
        for (int i = 0; i < x.length; i++){
            if (i == 0) System.out.print("Заданный целочисленный массив x ={"+x[i]);
            else System.out.print(", "+x[i]);
            if ((x[i]%k) == 0) proKrat = proKrat * x[i];
            if(i == (x.length - 1)) System.out.println("};");
        }
        System.out.println("\n Произведение єлементов кратных 9 равно: "+proKrat);
    }
    private static void Na_yroke_4_Example_5() {
        System.out.println("\n\n Example_5  -  Программа определяет местоположение улитки после 30-дневного исследования:");
        int maxL = 500;
        int A = 450;
        int[] dniInfo = {2, 2, -1, 2, 2, 2, -1, -1, 2, 2, 2, 2, -1, 2, 2, 2, -1, -1, 2, 2, 2, 2, -1, 2, 2, 2, -1, -1, 2, 2};
        for (int i = 0; i < dniInfo.length; i++){
            A = A + dniInfo[i];
            if (A > maxL){
                System.out.println("Улитка упала с верхушки дерева на "+i+" дне исследований");
                break;
            }
            if (i == (dniInfo.length -1)) System.out.println("После 30-го дня исследований улитка находится на расстоянии "+A+" см от земли.");
        }
    }
    private static void Na_yroke_4_Example_6(){
        System.out.println("\n\n Example_6  -  Программа вычисляет прибыль компании за n месяцев, на основании заданных массивов прибыли и расходов компании");
        int n = 6;
        double[] Rn = {12566.10, 16958.10, 22165.20, 24651.20, 19362.10, 17362.10};
        double[] Pn = {18625.30, 28635.30, 36265.40, 18254.60, 21367.20, 28657.90};
        double[] Zn = new double[n];
        int nMax = 0;
        int nMin = 0;
        int nPrib = 0;
        double summZn = 0;
        for (int i = 0; i < n; i++){
            Zn[i] = (Math.floor((Pn[i] - Rn[i])*100)) / 100;
            if(i == 0) System.out.print("Прибыль компании по месяцам за первые полгода равна Zn = {"+Zn[i]);
            else System.out.print(", "+Zn[i]);
            if (i == (n-1)) System.out.println("};");
            summZn += Zn[i];
            if (Zn[i] > 0) nPrib++;
            if (Zn[i] > Zn[nMax]) nMax = i;
            if (Zn[i] < Zn[nMin]) nMin = i;
        }
        System.out.println("Общяя прибыль составила: "+summZn+" грн.;");
        System.out.println("Максимальная прибыль получена в "+(nMax + 1)+" месяце: "+Zn[nMax]+" грн.;");
        System.out.println("Минимальная прибыль была в "+(nMin + 1)+" месяце: "+Zn[nMin]+" грн.;");
        System.out.println("Всего с положительным доходом "+nPrib+" месяцев.");
    }
    private static void Na_yroke_4_Example_7(){
        System.out.println("\n\n Example_7  -  Программа определяет 3 лучших и 3 худших результата соревнований по прыжкам в высоту и длинну,\n из двух массивов соответственно: H(n) и D(n):");
        int n = 10;
        int i = 0;
        int rez = 3;
        int[] nH = {222, 204, 235, 205, 215, 211, 201, 199, 214, 200};
        int[] nD = {355, 352, 368, 361, 354, 362, 359, 351, 349, 363};
        Arrays.sort(nH);
        Arrays.sort(nD);
        System.out.println("Тройка худших результатов по прыжкам: \n\n   в высоту   |   в длинну");
        while (i < rez){
            System.out.println("     "+nH[i]+"      |     "+nD[i]);
            i++;
        }
        System.out.println("Тройка лучших результатов по прыжкам: \n\n   в высоту   |   в длинну");
        while (i < n){
            if(i >= (n - rez)) System.out.println("     "+nH[i]+"      |     "+nD[i]);
            i++;
        }
    }
    private static void Na_yroke_4_Example_8(){
        System.out.println("\n\n Example_8  -  Алгоритм переворота элементов массива: ");
        int[] primer = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 0;
        int x;
        int k = primer.length - 1;
        while(i < k){
            x = primer[i];
            primer[i] = primer[k];
            primer[k] = x;
            i++;
            k--;
        }
        for (int a:primer) {
            System.out.print(a+" ");
        }
    }
}
