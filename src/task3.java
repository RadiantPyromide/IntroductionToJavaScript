import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введие число ");
        Scanner scanner=new Scanner(System.in);
        int diget= scanner.nextInt();
        System.out.println(Math.abs(diget));
    }
}
