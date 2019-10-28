import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestBase {
    private List<String> questions;

    public List<String> getQuestions() {
        return questions;
    }

    public QuestBase(String filename) throws FileNotFoundException {
        try (FileReader reader = new FileReader(filename)) {
            Scanner scanner = new Scanner(reader);
            questions = new ArrayList<>();
            while(scanner.hasNextLine()){
                questions.add(scanner.nextLine());
            }
        }
        catch (IOException ex) {
            throw new FileNotFoundException("Файл с базой ответов не существует");
        }
    }
}

