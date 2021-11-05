package com.wuzhi02.a1105_01conn;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class Conn01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.add("jack"));
        System.out.println(list+"\n");
        System.out.println(list.remove("jack"));
        System.out.println(list);

        try {
            list = null;
            System.out.println(list.add("jack"));
            System.out.println(list.contains("jack"));
            System.out.println(list);

            System.out.println(list.size());

            System.out.println(list.isEmpty());
        } catch (Exception e) {
            System.out.println(e.getMessage()+"空指针异常");
        }finally {
            System.out.println("最后处理");
        }
    }
}
