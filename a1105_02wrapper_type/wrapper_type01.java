package com.wuzhi02.a1105_02wrapper_type;
@SuppressWarnings({"all"})
public class wrapper_type01 {
    public static void main(String[] args) {
        int n1 = 100;
        Integer integer = new Integer(n1);
        System.out.println(integer);

        Integer integer1 = integer.valueOf(n1);
        System.out.println(integer);

        int interger2 = integer.intValue();


    }
}
