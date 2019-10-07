import java.util.ArrayList;

public class Counter {

    public TTestResult<Integer> temperTest(ArrayList<String> answers){
        int odd = 0;
        int even = 0;
        for(int i = 1; i  <= answers.size(); i++){
            if(i % 2 != 0 && answers.get(i-1).equalsIgnoreCase("нет")){
                odd++;
            }
            else if(i % 2 == 0 && answers.get(i-1).equalsIgnoreCase("да")){
                even++;
            }
        }
        return new TTestResult<>(odd, even);
    }
}
