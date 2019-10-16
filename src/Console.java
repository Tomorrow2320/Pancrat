import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Console {
    private TemperTest temperTest;

    public Console() {
        temperTest = new TemperTest();
    }

    public String execute(String command) {
        String out = "";
        switch (command) {
            case "/help":
                out = readFile("Intro.txt");
                break;
            case "/test":
                if (temperTest.getState() == "in progress"){
                    out = "Для начала выйди из текущего теста ;)";
                }
                else{
                    out = readFile("AboutTemperTest.txt") + temperTest.start();
                }
                break;
            case "/end":
                System.exit(0);
                break;
            case "/exit":
                temperTest.clearTest();
                out = "Оповещаю, братец: Ты вышел из теста :*";
                break;
            default:
                if (temperTest.getState() == "in progress"){
                    out = temperTest.execute(command);
                }
                else out = "Соре, я тебя не понимаю, братец(";
                break;
        }
        return out;
    }

    public String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
        } catch (IOException ex) {
            return (ex.getMessage());
        }
        return stringBuilder.toString();
    }
}
