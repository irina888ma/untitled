public class Test2 {
public static void main(String args[]){
    Integer namber = 36;
    Integer decimal = 36/10;
    System.out.println("десятки " + decimal);
    Integer units = 36%10;
    System.out.println("единицы " + units);
    Integer sum = decimal + units;
    System.out.println("сумма цифр " + sum);
    Integer proizv = decimal * units;
    System.out.println("произведение " + proizv);
}


}
