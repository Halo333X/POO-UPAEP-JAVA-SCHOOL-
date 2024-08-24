import java.util.Scanner;

public class Act1_6 {

    private Scanner scanner = new Scanner(System.in);
    private int input;

    public static void main(String[] args) {
        Act1_6 act1_6 = new Act1_6();
        act1_6.startProgram();
    }

    public void showRes(double res) {
        System.out.println("The result is: " + res);
        startProgram();
    }

    public void sumatoria1() {
        double res = 0;
        for (int i = 1; i <= 5; i++) {
            res += 1;
        }
        showRes(res);
    }

    public void sumatoria2() {
        double res = 0;
        for (int i = 1; i <= 5; i++) {
            res += (2 * i);
        }
        showRes(res);
    }

    public void sumatoria3() {
        double res = 0;
        for (int i = 3; i <= 6; i++) {
            res += (2 * i - 1);
        }
        showRes(res);
    }

    public void sumatoria4() {
        System.out.print("Introduzca el valor de n: ");
        int n = scanner.nextInt();
        double res = 0;
        for (int i = 1; i <= n; i++) {
            double r = (2 * i - 1);
            res += (r / (i * (i + 1)));
        }
        showRes(res);
    }

    public void sumatoria5() {
        System.out.print("Introduzca el valor de n: ");
        int n = scanner.nextInt();
        double res = 0;
        for (int i = 2; i <= 6; i++) {
            double r = i + 1;
            res += (r / i);
        }
        showRes(res);
    }

    public void sumatoria6() {
        double res = 0;
        for (int i = 2; i <= 7; i++) {
            double r = i * i;
            res += (r / (i + 1));
        }
        showRes(res);
    }

    public void sumatoria7() {
        System.out.print("Introduzca el valor de n: ");
        int n = scanner.nextInt();
        double res = 0;
        for (int i = 1; i <= n; i++) {
            double f1, f2;
            f1 = (i / Math.pow(n, 2));
            f2 = (Math.pow(i, 2) / Math.pow(n, 3));
            res += f1 + f2;
        }
        showRes(res);
    }

    public void startProgram() {
        System.out.print("Introduzca que tipo de sumatoria elegirá: ");
        input = scanner.nextInt();
        switch (input) {
            case 0: {
                sumatoria1();
                break;
            }
            case 1: {
                sumatoria2();
                break;
            }
            case 2: {
                sumatoria3();
                break;
            }
            case 3: {
                sumatoria4();
                break;
            }
            case 4: {
                sumatoria5();
                break;
            }
            case 5: {
                sumatoria6();
                break;
            }
            case 6: {
                sumatoria7();
                break;
            }
            case 7: {
                System.out.println("Saliendo...");
                break;
            }
            default: {
                startProgram();
                break;
            }
        }
    }
}