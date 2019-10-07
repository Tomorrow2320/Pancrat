public class Analyzer {

    public String temperTest(TTestResult<Integer> data){
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
