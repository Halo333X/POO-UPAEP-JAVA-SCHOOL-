import java.util.Scanner;

public class Act1_4 {

    private double n1;
    private double n2;

    public static void main(String[] args) {
        Act1_4 act1_4 = new Act1_4();
        act1_4.readOption();
    }

    public void readOption() {
        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.print("Introduzca el primer número: ");
            n1 = scan.nextDouble();
            System.out.print("Introduzca el segundo número: ");
            n2 = scan.nextDouble();
            System.out.println("0: Addition");
            System.out.println("1: Subtraction");
            System.out.println("2: Multiplication");
            System.out.println("3: Division");
            System.out.println("4: Pow");
            System.out.println("5: Pow with For");
            System.out.println("6: Exit");
            System.out.print("Enter an option: ");
            input = scan.nextInt();
            if (input != 6) {
                calculate(input);
            }
        } while (input != 6);

        System.out.println("Program exited.");
        scan.close();
    }

    public void calculate(int key) {
        switch (key) {
            case 0:
                double suma = n1 + n2;
                System.out.println("The result of the addition is: " + suma);
                break;
            case 1:
                double resta = n1 - n2;
                System.out.println("The result of the subtraction is: " + resta);
                break;
            case 2:
                double multiply = n1 * n2;
                System.out.println("The result of the multiplication is: " + multiply);
                break;
            case 3:
                if (n2 != 0) {
                    double division = n1 / n2;
                    System.out.println("The result of the division is: " + division);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            case 4: {
                double pow = Math.pow(n1, n2);
                System.out.println("The result of the pow is: " + pow);
                break;
            }
            case 5: {
                double pow = 1;
                for (int i = 0; i < n2; i++) {
                    pow *= n1;
                }
                System.out.println("The result of the pow with for is: " + pow);
                break;
            }
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}