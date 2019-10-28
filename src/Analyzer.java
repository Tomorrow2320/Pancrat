import java.util.List;

public class Analyzer {

    public TTestResult count(List<String> answers){
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
        return new TTestResult(odd, even);
    }
    public String analyze(TTestResult data){
        if(data.odd() > 3){
            if(data.even() > 3){
                return "Ты, братец, холерик";
            }
            else if(data.even() < 3){
                return "Ты, братец, сангвиник";
            }
            else{
                return "Ты, братец, смешанный с холериком сангвиник";
            }
        }
        else if (data.odd() < 3){
            if (data.even() < 3){
                return "Ты, братец, флегматик";
            }
            else if (data.even() > 3){
                return "Ты, братец, меланхолик";
            }
            else {
                return "Ты, братец, смешанный с флегматиком меланхолик";
            }
        }
        else{
            return "У тебя, братец, смешанный тип";
        }
    }
}
