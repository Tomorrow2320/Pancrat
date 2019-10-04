import java.util.ArrayList;
import java.util.Scanner;

public class Tests {
    public void temperTest() {
        String input;
        Scanner in = new Scanner(System.in);
        QuestBase questBase = new QuestBase("Questions.txt");
        ArrayList<String> questions = questBase.getQuestions();
        AnsBase answers = new AnsBase();
        Counter counter = new Counter();
        Analyzer analyzer = new Analyzer();
        Console console = new Console();
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            input = in.nextLine();
            if(console.getCommands().contains(input)){
                console.execute(input);
                i--;
                continue;
            }
            while (!input.equalsIgnoreCase("да") && !input.equalsIgnoreCase("нет")) {
                System.out.println("Сорре, я не знаю такого ответа(");
                input = in.nextLine();
            }
            answers.add(input);
        }
        analyzer.temperTest(counter.temperTest(answers.getAnswers()));
    }
}
