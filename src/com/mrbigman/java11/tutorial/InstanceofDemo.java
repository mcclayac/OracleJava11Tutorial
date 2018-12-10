package com.mrbigman.java11.tutorial;

public class InstanceofDemo {

    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));


        System.out.printf("obj1 instanceof Parent: %b \n" ,(obj1 instanceof Parent));
        System.out.printf("obj1 instanceof Child: %b \n", (obj1 instanceof Child));
        System.out.printf("obj1 instanceof MyInterface: %b \n",  (obj1 instanceof MyInterface));
        System.out.printf("obj2 instanceof Parent: %b \n",  (obj2 instanceof Parent));
        System.out.printf("obj2 instanceof Child:%b \n",  (obj2 instanceof Child));
        System.out.printf("obj2 instanceof MyInterface: %b \n\n",(obj2 instanceof MyInterface));


    }

}
