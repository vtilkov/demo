package ru.stepup.demo;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        String a = String.valueOf("1");
        String b = new String("1");
        if (a.equals(b)) {
            System.out.println(true);
            doSomething();
        } else {
            System.out.println(false);
            doSomething();
            System.out.println("-");
        }
        ValueC vc = new ValueC("1");
        vc.setC(5);
        System.out.println(vc.getC());
    }

    public static void doSomething() {
        System.out.println("Привет Мир");
    }
}