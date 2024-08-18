import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количестко часов: ");
        int f = scanner.nextInt();
        System.out.println("Введите количество минут ");
        int minets = scanner.nextInt();
        System.out.println("Введите количестко сеукунда");
        int second= scanner.nextInt();
        if (f<0 || f>23) {
            System.out.println("Вы ввели не верное время в часах");
        }
if(second<0 || second>60){
    System.out.println("Вы ввели не верное время в минутах");
}
if(minets<0 || minets>60){
    System.out.println("Вы ввели не верное меря в скундах");
}
else {
    System.out.println("Часов: " +f +" Минут: "+minets +" Секунд " + second);
}
    }}