import java.util.Scanner;

public class Ruin {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How much money did you start with?");
        double startAmount = in.nextDouble();
        double currentAmount = startAmount;
        System.out.println("What is the win probability? (percent chance of winning)");
        double winChance = in.nextDouble();
        System.out.println("What is the win limit?");
        double winLimit = in.nextDouble();
        System.out.println("How many days will you simulate?");
        int totalSimulations = in.nextInt();
        boolean success; 

        for (  int i = totalSimulations; i > 0; i--){
            int numPlays = 0;
            currentAmount=startAmount;
            
            while (currentAmount < winLimit && currentAmount > 0){
                numPlays++;
                double probability = Math.random() * 100; // 0 - 100
                if (probability > winChance){
                    currentAmount--;
                    
                }   
                else{
                    currentAmount++;
                }
           

         }
        success = (startAmount==winLimit);
         System.out.println("You have " + totalSimulations + " left.");
         System.out.println("There were " + numPlays + " number of plays.");
         if (success == true) {
            System.out.println("The day ended in success");
         }
        else {
            System.out.println("The day ended in ruin");



        }



    }

} }
