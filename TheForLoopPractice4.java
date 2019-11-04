public class TheForLoopPractice4 {
    public static void main(String[] arg) {
        for (int i = (2 + 2); i <= (17 * 3); i++) {
            System.out.println(i + " squared = " + (i * i));
        }
        for (int i = 1; i <= 30; i++) {
            System.out.println("+--------+");
        }
        System.out.println();
        for (int i = 1; i <= 1; i++) {
            System.out.println("+--------+");
        }
        System.out.println();
        for (int i = 1; i <= 0; i++) {
            System.out.println("+--------+"); // never executes
        }
        System.out.println();
        for (int i = 1; i <= 20; i++) {
            System.out.println("Hi!");
            System.out.println("Ho!");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Hi there.");
            }
        }
        System.out.println();
        for (int i = 1; i < 50; i++) {
            System.out.println("Hi there.");
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
