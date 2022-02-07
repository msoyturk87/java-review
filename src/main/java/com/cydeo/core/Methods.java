package com.cydeo.core;

public class Methods {


        // belongs object
        public void methodA(){
            System.out.println("methodA() is called");
        }

        public void methodA(String str){
            System.out.println("methodA(String str) is called");
        }

        public String  methodB(){
            return "methodB() is called";
        }

        public String methodB(int x){
            return "methodB(int x) is called";
        }

        // belongs class
        // it can be called via className
        public static void methodC(){
            System.out.println("methodC() is called");
        }

        /*
        if method does not have dependency to instance variable we can create it as static

         */

    }

