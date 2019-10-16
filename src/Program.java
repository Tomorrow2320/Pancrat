import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        String input = "/help";
        Scanner in = new Scanner(System.in);
        Console console = new Console();
        while (true) {
            System.out.println(console.execute(input));
            input = in.nextLine();
        }
    }
}

