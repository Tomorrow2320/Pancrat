import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TemperTest {

    private QuestBase questBase;
    private List<String> answers;
    private int questCount;
    private Analyzer analyzer;
    private Boolean state;

    public TemperTest() throws FileNotFoundException {
        answers = new ArrayList<>();
        analyzer = new Analyzer();
        questBase = new QuestBase("Questions.txt");
        questCount = 0;
        state = false;
    }

    public Boolean getState() {
        return state;
    }

    public String start() {
        state = true;
        String out = questBase.getQuestions().get(questCount);
        questCount++;
        return out;
    }
    public void clearTest(){
        answers.clear();
        questCount = 0;
        state = false;
    }
    public String execute(String answer) {
        String out;
        if (!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("нет")) {
            out = "Так да или нет?";
        }
        else {
            answers.add(answer);
            if (questCount < questBase.getQuestions().size()){
                out = questBase.getQuestions().get(questCount);
                questCount++;
            }
            else {
                out = analyzer.analyze(analyzer.count(answers));
                clearTest();
            }
        }
        return out;
    }
}

