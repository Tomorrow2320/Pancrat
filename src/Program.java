import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);
        Console console = new Console();
        console.scanPrint("Intro.txt");
        while (true) {
            input = in.nextLine();
            console.execute(input);
        }
    }
}

