package lab9;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nException1:");
        Exception1 test = new Exception1();
        //test.exceptionDemo();

        System.out.println("\nException2:");
        Exception2 test2 = new Exception2();
        //test2.exceptionDemo();

        System.out.println("\nException3:");
        Exception3 test3 = new Exception3();
        //test3.exceptionDemo();

        System.out.println("\nException4:");
        Exception4 test4 = new Exception4();
        //test4.exceptionDemo();

        System.out.println("\nThrowsDemo:");
        ThrowsDemo test5 = new ThrowsDemo();
        //test5.printMessage("Hello");
        //test5.printMessage(null);

        System.out.println("\nThrowsDemo2:");
        ThrowsDemo2 test6 = new ThrowsDemo2();
        test6.getKey();

    }
}
