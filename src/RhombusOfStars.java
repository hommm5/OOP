import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int index = 0;
        printRhombus(number, index);

    }

    private static void printRhombus(int number, int index) {
        if (index >= number) {
            return;
        }
        printEmptySpace(number, index);
        for (int i = 0; i <= index; i++) {
            System.out.print("* ");
        }
        System.out.println();
        printRhombus(number, index + 1);
        printEmptySpace(number, index - 1);
        for (int i = 0; i < index; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printEmptySpace(int number, int index) {
        for (int i = number-1; i > index; i--) {
            System.out.print(' ');
        }
    }
}
