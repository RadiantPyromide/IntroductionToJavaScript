import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки кратности 5");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=x%5;
        if (y>0){
            System.out.println("Число не кратно 5");
        }
        if (y==0){
            System.out.println("Чсило кратно 5");
        }

    }
}
