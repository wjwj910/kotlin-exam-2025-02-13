public class JMain {
    public static void main(String[] args) {
        final int number = 10; // 정수형 변수 선언
        String message = "Hello, Java!"; // 문자열 변수 선언

        System.out.println("Number: " + number);
        System.out.println("Message: " + message);

        int num = 15;

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }


        int result = add(5, 10);
        System.out.println("Result: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
