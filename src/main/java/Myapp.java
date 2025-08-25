import java.util.Scanner;

public class Myapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Myapp app = new Myapp();
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("2 + 3 = " + app.addMe(num1, num2));
    }

    public int addMe(int a, int b) { return a + b; }
    public int subMe(int a, int b) { return a - b; }
    public int mulMe(int a, int b) { return a * b; }
    public int divMe(int a, int b) { return a / b; }
}
