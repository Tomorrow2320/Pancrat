import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestBase {
    private int questCount;
    private ArrayList<String> questions;

    public String getQuestion(int i){
        return questions.get(i);
    }

    public int getQuestCount() {
        return questCount;
    }

    public QuestBase(String filename){
        questCount = 0;
        try (FileReader reader = new FileReader(filename)) {
            Scanner scanner = new Scanner(reader);
            questions = new ArrayList<>();
            while(scanner.hasNextLine()){
                questions.add(scanner.nextLine());
                questCount++;
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

