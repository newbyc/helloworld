package uk.gov.dwp.helloworld;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello world");
        add(1, 3);
        add(4, 899);

        int c = 1234;
        int d = 7;
        multiply(c, d);
        add(c, d);
        add(1, 9);


        sub(0, 15);
        sub(0, 5);
        sub(66, 5);
        sub(99, 5);


        add(0, 15);
        add(0, 5);
        add(66, 5);
        add(99, 5);


        multiply(0, 15);
        multiply(0, 5);
        multiply(66, 5);
        multiply(99, 5);


        divide(0, 15);
        divide(0, 5);
        divide(66, 5);
        divide(99, 5);


    }

    public static void sub(int x, int y) {
        System.out.println(x - y);


    }

    public static void add(int x, int y) {

        System.out.println(x + y);


    }

    public static void multiply(int a, int b) {

        System.out.println(a * b);

    }

    public static void divide(int x, int y) {

        System.out.println(x / y);


    }

}