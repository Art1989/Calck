import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new  int[9];

        Scanner s = new Scanner(System.in);

        System.out.println("Vvedite 0 yacheika numbers "+numbers[0]);
        numbers[0] = s.nextInt();

        char str1;
        System.out.println("Vvedite oper");
        str1 = s.next().charAt(0);
        System.out.println("oper " +str1);

        System.out.println("Vvedite 1 yacheika numbers "+numbers[1]);
        numbers[1] = s.nextInt();


        switch (str1) {
            case '+':
                numbers[2] = numbers[0] + numbers[1];
                break;
            case '-':
                numbers[2] = numbers[0] - numbers[1];
                break;
            case '*':
                numbers[2] = numbers[0] * numbers[1];
                break;
            case '/':
                numbers[2] = numbers[0] / numbers[1];
                break;
            default:
                System.out.println("Error! nezya eto vvodit");
                return;

        }
        System.out.println("Rezultat");
        System.out.println(numbers[0] + " " + str1 + " " + numbers[1] + " = " + numbers[2]);
    }
}