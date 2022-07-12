import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int result = scanner.nextInt();
        for (int i = 1; i < size; i++) {
            int number = scanner.nextInt();
            if (number < result) {
                result = number;
            }
        }
        System.out.println(result);
    }
}