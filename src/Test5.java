import java.util.Scanner;

public class Test5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число a:");
        int a= sc.nextInt();
        System.out.println("введите число b:");
        int b= sc.nextInt();
        sum(a,b);
    }
    public static void sum(int firstNumber, int secondNumber){
        System.out.println(firstNumber+secondNumber);
    }
}
