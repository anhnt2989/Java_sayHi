import java.util.Scanner;

public class Java_sayHi {
    public static void main(String[] args) {
        System.out.println("Enter your full name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
