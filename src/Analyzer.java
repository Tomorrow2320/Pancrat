public class Analyzer {

    public void temperTest(Pair<Integer> data) {
        if (data.odd() > 3) {
            if (data.even() > 3) {
                System.out.println("Ты, братец, холерик");
            } else if (data.even() < 3) {
                System.out.println("Ты, братец, сангвиник");
            } else {
                System.out.println("Ты, братец, смешанный с холериком сангвиник");
            }
        } else if (data.odd() < 3) {
            if (data.even() < 3) {
                System.out.println("Ты, братец, флегматик");
            } else if (data.even() > 3) {
                System.out.println("Ты, братец, меланхолик");
            } else {
                System.out.println("Ты, братец, смешанный с флегматиком меланхолик");
            }
        } else {
            System.out.println("У тебя, братец, смешанный тип");
        }
    }
}
