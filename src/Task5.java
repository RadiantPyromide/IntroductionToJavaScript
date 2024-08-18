import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите координату Х");
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        System.out.println("Введите координату Y");
        int y= scanner.nextInt();
        if(x>0&&y>0){
            System.out.println("Точка в первной четверти");}
            if(x<0&&y>0){
                System.out.println("Точка во второй четверти ");
            }
            if (x<0&&y<0){
                System.out.println("Точка в третей четверти");
            }
            if (x>0&&y<0){
                System.out.println("Точка в четверной четверти");
            }
            if (x==0||y==0){
            System.out.println("Точка лежит на оси");
        }
    }
}
