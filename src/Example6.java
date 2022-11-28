import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String FirstName = in.nextLine();

        System.out.println("Введите фамилию: ");
        String SecondName = in.nextLine();

        System.out.println("Введите отчество: ");
        String ThirdName = in.nextLine();

        System.out.println("Hello " + FirstName + " " + SecondName + " " + ThirdName);
        in.close();
         }
    }
