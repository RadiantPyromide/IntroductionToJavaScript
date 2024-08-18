import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("С какой вы планеты ?");
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.next();
        String str2="Земля";
        String str3="земля";
        if ((str2.equals(str1)) || (str3.equals(str1))){
            System.out.println("Привет землянин!");
        }else{System.out.println("Привет инопланетянин!");}}}

