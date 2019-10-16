public class TemperTest {

    private QuestBase questBase;
    private AnsBase answers;
    private int questCount;
    private Counter counter;
    private Analyzer analyzer;
    private String state;

    public TemperTest() {
        answers = new AnsBase();
        counter = new Counter();
        analyzer = new Analyzer();
        questBase = new QuestBase("Questions.txt");
        questCount = 0;
        state = "";
    }

    public String getState() {
        return state;
    }

    public String start() {
        String out = questBase.getQuestion(questCount);
        questCount++;
        state = "in progress";
        return out;
    }
    public void clearTest(){
        answers.clearAns();
        questCount = 0;
        state = "";
    }
    public String execute(String answer) {
        String out;
        if (!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("нет")) {
            out = "Так да или нет?";
        }
        else {
            answers.add(answer);
            if (questCount < questBase.getQuestCount()){
                out = questBase.getQuestion(questCount);
                questCount++;
            }
            else {
                out = analyzer.temperTest(counter.temperTest(answers.getAnswers()));
                clearTest();
            }
        }
        return out;
    }
}

