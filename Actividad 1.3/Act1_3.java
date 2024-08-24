import java.util.Scanner;

public class Act1_3 {

    private double n1;
    private double n2;
    private double pow;

    public static void main(String[] args) {
        Act1_3 act1_3 = new Act1_3();
        act1_3.readOption();
    }

    public void readOption() {
        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.print("Introduzca el primer número: ");
            n1 = scan.nextInt();
            System.out.print("Introduzca el segundo número: ");
            n2 = scan.nextInt();
            System.out.println("0: Addition");
            System.out.println("1: Subtraction");
            System.out.println("2: Multiplication");
            System.out.println("3: Division");
            System.out.println("4: Pow");
            System.out.println("5: Exit");
            System.out.print("Enter an option: ");
            input = scan.nextInt();
            if (input != 5) {
                calculate(input);
            }
        } while (input != 5);

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
                pow = Math.pow(n1, n2);
                System.out.println("The result of the pow is: " + pow);
                break;
            }
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}