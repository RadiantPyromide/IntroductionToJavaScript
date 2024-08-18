import java.util.Scanner;

public class Swich2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите первтое число");
        int x= sc.nextInt();
        System.out.println("Введите второе число");
        int y= sc.nextInt();
        System.out.println("Выберите действеи (*,/,+,-.)");
        char options=sc.next().charAt(0);
       if (options=='+'){
           System.out.println(x+y);
       }
if (options=='-'){
    System.out.println(x-y);}
    if (options=='/'){
        System.out.println(x/y);
    }
if (options=='*'){
    System.out.println(x*y);
}

    }


    }



