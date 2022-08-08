
public class GradingExercise {
    public static void main(String[] args) {
        int c = 90;
        int q = 65;
        int x = 50;

        // intial conditon
        if (c > q) {
            System.out.println("You getting upto an A");
        }
        //flow control else
        else if (q >= c){
            System.out.println("Next time you get upto an A");
        }
        else if (q >x) {
            System.out.println("You can try again in 48 hrs");
        }


    }

}
