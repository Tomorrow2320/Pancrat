import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private static ArrayList<String> commands;

    public ArrayList<String> getCommands(){
        return commands;
    }

    public Console(){
        try (FileReader reader = new FileReader("ConsoleCommands.txt")) {
            Scanner scanner = new Scanner(reader);
            commands = new ArrayList<>();
            while(scanner.hasNextLine()){
                commands.add(scanner.nextLine());
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void execute(String command){
        switch (command) {
            case "/help":
                scanPrint("Intro.txt");
                break;
            case "/test":
                scanPrint("AboutTemperTest.txt");
                Tests tests = new Tests();
                tests.temperTest();
                break;
            case "/end":
                System.exit(0);
                break;
            default:
                System.out.println("Сорре, я тебя не понимаю, братец(");
                break;
        }
    }

    public void scanPrint(String name){
        try(FileReader reader = new FileReader(name)){
            Scanner scanner = new Scanner(reader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
