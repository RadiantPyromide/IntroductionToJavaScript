import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        System.out.println("Введите второе число ");
        int y= scanner.nextInt();
        if(x>y){
            System.out.println(x);
        }
        if (x<y){
            System.out.println(y);
        }
        if (x==y){
            System.out.println("Числа равны ");
        }
    }
}
