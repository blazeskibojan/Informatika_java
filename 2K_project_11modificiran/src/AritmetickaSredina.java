import java.util.Scanner;

public class AritmetickaSredina {
    int a;
    int b;
    int c;

    AritmetickaSredina(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void calculateAS() {
        System.out.println((a + b + c) / 3);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Внеси ги броевите за првата инстанца:");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        AritmetickaSredina firstN = new AritmetickaSredina(a1, b1, c1);

        System.out.println("Внеси ги броевите за втората инстанца:");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        AritmetickaSredina secondN = new AritmetickaSredina(a2, b2, c2);

        firstN.calculateAS();
        secondN.calculateAS();

        scanner.close();
    }
}
