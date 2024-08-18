import java.util.Scanner;

public class Tack1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число для проверки");
        int diget=scanner.nextInt();
        if (diget>0){
            System.out.println("Число положительное");
        }
        if (diget<0){
            System.out.println("Число отрицательное");
        }
        if(diget==0){
            System.out.println("Число равно нулую");
        }
    }
}
