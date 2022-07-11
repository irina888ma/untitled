import java.util.Scanner;

public class TestSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число= ");
        Integer n= sc.nextInt();
        int i=1;
        while (i<n) {
            System.out.println(i+" + 1 = "+(i+1));
            i=i+1;
        }
    }
}
