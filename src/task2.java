import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст");
        Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();
        if(age>=0 && age<=120){
            System.out.println("Ваш возраст: "+age);
        }
        else {
            System.out.println("Вы ввели не корректрые данные");
        }
    }
}
