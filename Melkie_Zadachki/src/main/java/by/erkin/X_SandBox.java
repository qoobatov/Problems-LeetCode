package by.erkin;

import java.util.ArrayList;

public class X_SandBox {
    public static void main(String[] args) {


        // как из числа сделать массив из чисел
        int digits = 123456789;

        ArrayList<Integer> list = new ArrayList();

        do {
            int x = digits % 10;
            list.add(x);
            digits /= 10;
        } while (digits != 0);

        System.out.println(list.reversed());


        String str = "Hello World";

        ArrayList<String> list2 = new ArrayList();

        for (int i = 0; i < str.length(); i++) {
            list2.add(str.substring(i, i + 1));
        }
        System.out.println(list2);
    }

}
