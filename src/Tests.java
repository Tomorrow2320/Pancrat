
public class Tests {
    private QuestBase questBase;
    private AnsBase answers;
    private int questCount = 0;
    private Counter counter;
    private Analyzer analyzer;

    public Tests() {
        answers = new AnsBase();
        counter = new Counter();
        analyzer = new Analyzer();
        questBase = new QuestBase("Questions.txt"); //разный для разных тестов - решить!!!
    }

    public void start() {
        System.out.println(questBase.getQuestions(questCount));
        questCount++;
    }

    public void execute(String answer) {
        if (!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("нет")) {
            System.out.println("Так да или нет?");
        } else {
            answers.add(answer);
            if (questCount >= questBase.getQuestCount()){
                System.out.println(analyzer.temperTest(counter.temperTest(answers.getAnswers())));
                answers.clearAns();
                questCount = 0;
            }
            else {
                System.out.println(questBase.getQuestions(questCount));
                questCount++;
            }
        }
    }
}

