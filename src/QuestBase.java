
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestBase {
    private ArrayList<String> questions;

    public ArrayList getQuestions(){
        return questions;
    }

    public QuestBase(String filename){
        try (FileReader reader = new FileReader(filename)) {
            Scanner scanner = new Scanner(reader);
            questions = new ArrayList<>();
            while(scanner.hasNextLine()){
                questions.add(scanner.nextLine());
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

