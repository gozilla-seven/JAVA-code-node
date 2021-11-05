package com.wuzhi02.a1105_03exception;

public class Exception01 {
    public static void main(String[] args) /*throws AgeException*/
    {
//        AgeException.noNew();

        throw new AgeException("年龄需要在 18~120 之间");
    }
}

    class AgeException extends RuntimeException{
//        static void noNew(){
//            System.out.println("这是静态方法");
//        }

        AgeException(String message) {
            super(message);
        }


    }
