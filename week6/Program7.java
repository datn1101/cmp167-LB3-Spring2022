import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        int total = sum3(3, 4, 5);

        System.out.println(total);

    }

    public static int sum3(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        return total;
    } {
        System.out.println("How many numbers do you want to enter?");
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        double[] array = new double[count];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter input number " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        scanner.close();

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double average = sum / count;

        System.out.format("The average is: %.2f", average);

    }

}