import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        input.append(scanner.nextLine());
        System.out.println(input.toString().equals(input.reverse().toString()) ? "yes" : "no");
    }
}