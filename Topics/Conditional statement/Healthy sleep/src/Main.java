import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer min = scanner.nextInt();
        Integer max = scanner.nextInt();
        Integer sleepTime = scanner.nextInt();
        if (sleepTime < min) {
            System.out.println("Deficiency");
        } else if (sleepTime > max) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}