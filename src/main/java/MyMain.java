
public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        double n=Math.random();
        int num=(int) (n*10000);
        return num%7;
    }



    // Calculate the probability of rolling at least one 6 when rolling
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE
        int count=0;
        for (int i = 0; i < 10000; i++) {
            for (int j=0;j<=6;j++) {
                int num = rollDie();
                if (num == 6) {
                    count += 1;
                    break;
                }
            }
        }
        double n=count;
        double x=n/100;
        return x;
    }
        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:


    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int c=0;
        int count=0;
        for (int i = 0; i < 10000; i++) {
            count=0;

            for (int j=0;j<=13;j++) {

                int num = rollDie();
                if (num == 6) {
                    count += 1;
                if (count==2){
                    c+=1;
                    break;
                }
                }
            }
        }
        double n=c;
        double x=n/100;
        return x;
    }
    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int c=0;
        int count=0;
        for (int i = 0; i < 10000; i++) {
            count=0;

            for (int j=0;j<=20;j++) {

                int num = rollDie();
                if (num == 6) {
                    count += 1;
                    if (count==3){
                        c+=1;
                        break;
                    }
                }
            }
        }
        double n=c;
        double x=n/100;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(rollDie());
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
        System.out.println("The most likely one is one six in six rolls!");
    }
}
