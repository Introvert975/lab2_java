import java.util.Objects;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("REX code:");
            String REXcode = scanner.next();
            if(Objects.equals(REXcode, "exit"))
            {
                scanner.close();
                break;
            }
            boolean unswer = REXcode.matches("^#[0-9a-fA-F]{6}$");
            System.out.println(unswer);
        }
        System.out.println("Thanks!");

    }


}