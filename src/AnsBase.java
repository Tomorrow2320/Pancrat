import java.util.ArrayList;

public class AnsBase {
    private ArrayList<String> answers;

    public AnsBase(){
        answers = new ArrayList<>();
    }

    public ArrayList getAnswers(){
        return answers;
    }

    public void add(String answer) throws IllegalArgumentException{
        if(answer.isEmpty()){
            throw new IllegalArgumentException("Ответ - пустая строка(");
        }
        answers.add(answer);
    }
}
