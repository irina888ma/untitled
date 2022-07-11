import java.util.Scanner;

public class Test2treug {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите сторону первого треугольника a= ");
        Double a= sc.nextDouble();
        System.out.println("Введите сторону первого треугольника b= ");
        Double b= sc.nextDouble();
        System.out.println("Введите сторону первого треугольника c= ");
        Double c= sc.nextDouble();
        System.out.println("Введите сторону второго треугольника a1= ");
        Double a1= sc.nextDouble();
        System.out.println("Введите сторону второго треугольника b1= ");
        Double b1= sc.nextDouble();
        System.out.println("Введите сторону второго треугольника c1= ");
        Double c1= sc.nextDouble();
        Double P=0.0;
        Double P1=0.0;
        Double S=0.0;
        Double S1=0.0;
        Double Poly =1.0;
        Double Poly1=1.0;
        Perimetr (P,a,b,c);
      // Perimetr1 (P1,a1,b1,c1);
       Sgr (S,Poly,P,a,b,c);
       Sgr1(S1,Poly1,P1,a1,b1,c1);
       System.out.println("Сумма периметров двух треуг.="+ (Perimetr(P,a,b,c)+Perimetr(P1,a1,b1,c1)));
       System.out.println("Сумма площадей двух треуг.=" + (Sgr(S, Poly, P,a,b,c)+Sgr1(S1,Poly1,P1,a1,b1,c1)));
    }
public static Double Perimetr (Double P, Double a,Double b, Double c) {
    P = a + b + c;
    return P;
}
/*public static Double Perimetr1 (Double P1, Double a1, Double b1, Double c1) {
    P1 = a1 + b1 + c1;
    return P1;
}*/
public static Double Sgr (Double S, Double Poly, Double P, Double a, Double b, Double c){
        Poly=Perimetr(P,a,b,c)/2;
        S= Math.sqrt(Poly*(Poly-a)*(Poly-b)*(Poly-c));
        return S;
}
public static Double Sgr1 (Double S1, Double Poly1, Double P1, Double a1, Double b1, Double c1){
        Poly1= Perimetr(P1,a1,b1,c1)/2;
        S1=Math.sqrt(Poly1*(Poly1-a1)*(Poly1-b1)*(Poly1-c1));

        return S1;
}
}




