import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Console {
    private TemperTest temperTest;

    public Console() throws FileNotFoundException {
        temperTest = new TemperTest();
    }

    public String execute(String command) throws FileNotFoundException {
        String out = "";
        switch (command) {
            case "/help":
                out = readFile("Intro.txt");
                break;
            case "/test":
                if (temperTest.getState()){
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
                if (temperTest.getState()){
                    out = temperTest.execute(command);
                }
                else out = "Соре, я тебя не понимаю, братец(";
                break;
        }
        return out;
    }

    public String readFile(String fileName) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
        } catch (IOException ex) {
            throw new FileNotFoundException("Файл не существует");
        }
        return stringBuilder.toString();
    }
}
