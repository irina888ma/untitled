import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число =");
        Integer a= sc.nextInt();
        System.out.println("Введите количество повторов =");
        Integer n= sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.println(a);
        }
    }
}