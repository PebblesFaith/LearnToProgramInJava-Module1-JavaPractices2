public class ScopePractice2 {
    public static void main(String[] args) {
        int squared = 0;  // Declaration is  now in outer scope.
        for (int i = 1; i <= 5; i++) {
            squared = i * i; // Change this to an assignment statement.
            System.out.println(i + " squared  = " + squared);
        }
        System.out.println("Last squared  = " + squared);
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " squared  = " + (i * i));
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " cubed  = " + (i * i * i));
        }
    }

}
