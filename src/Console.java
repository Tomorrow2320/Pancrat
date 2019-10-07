import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private static ArrayList<String> commands;
    private Tests tests;
    private String curState;
/*
    public ArrayList<String> getCommands() {
        return commands;
        новый код
    }
*/
    public Console() {
        tests = new Tests();
        try (FileReader reader = new FileReader("ConsoleCommands.txt")) {
            Scanner scanner = new Scanner(reader);
            commands = new ArrayList<>();
            while (scanner.hasNextLine()) {
                commands.add(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setCurState(String curState) {
        this.curState = curState;
    }

    public void execute(String command) {
        switch (command) {
            case "/help":
                scanPrint("Intro.txt");
                break;
            case "/test":
                scanPrint("AboutTemperTest.txt");
                tests.start();
                curState = "test"; //выйти из состояния после конца теста
                break;
            case "/end":
                System.exit(0);
                break;
            default:
                if (curState == "test")
                    tests.execute(command);
                else System.out.println("Соре, я тебя не понимаю, братец(");
                break;
        }
    }

    public void scanPrint(String name) {
        try (FileReader reader = new FileReader(name)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
