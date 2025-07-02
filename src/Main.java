import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        guessthenumber();
        while(true) {
            System.out.println("Do you want to playmore?y/n");
            String ans = sc.next();
            if (ans.equals("y")){
                guessthenumber();
            }else{
                break;
            }
        }
        System.out.println("We hope that you enjoyed playing");
    }
    static void guessthenumber(){
        Scanner sc = new Scanner(System.in);
      long startTime,  ellapsedTime;
      long endTime = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 to 100");
        System.out.println("Can you guess the number?");
        System.out.println();
        System.out.println("Choose Level of difficulty:");
        System.out.println("1.Easy(10 chances)");
        System.out.println("2.Medium(5 chances)");
        System.out.println("3.Hard(3 chances)");
        int level = sc.nextInt();

        if (level == 1){
            System.out.println("Great! You have selected the Easy difficulty level.");
        }else if (level == 2){
            System.out.println("Great! You have selected the Medium difficulty level.");
        }else if (level == 3){
            System.out.println("Great! You have selected the Hard difficulty level.");
        }
        int guessNumber = (int)(Math.random()*100);
        int n = 1;

        if (level == 1){
            startTime = System.currentTimeMillis();
            while(n <= 10){
                System.out.println("Guess the number:");
                int guess = sc.nextInt();
                if (guess == guessNumber){
                    System.out.println("Congratulations! You guessed the correct number in " + n + " attempts.");
                    endTime = System.currentTimeMillis();
                    break;
                }else{
                    n++;
                    if (guess > guessNumber){
                        System.out.println("Incorrext! Number is less than " + guess);
                    }else {
                        System.out.println("Incorrect! Number is Greater than " + guess);
                    }
                }
            }

            ellapsedTime = endTime - startTime;
            long seconds = (ellapsedTime/1000)%60;
            long minutes = (ellapsedTime/1000)/60;
            System.out.printf("Time taken : %02d minutes %02d seconds\n", minutes, seconds);
        } else if (level == 2) {
            startTime = System.currentTimeMillis();
            while (n <= 5) {
                System.out.println("Guess the number:");
                int guess = sc.nextInt();
                if (guess == guessNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + n + " attempts.");
                    endTime = System.currentTimeMillis();
                    break;
                } else {
                    n++;
                    if (guess > guessNumber){
                        System.out.println("Incorrect! Number is less than " + guess);
                    }else {
                        System.out.println("Incorrect! Number is Greater than " + guess);
                    }
                }
            }
            ellapsedTime = endTime - startTime;
            long seconds = (ellapsedTime/1000)%60;
            long minutes = (ellapsedTime/1000)/60;
            System.out.printf("Time taken : %02d minutes %02d seconds\n", minutes, seconds);
        }else if (level == 3) {
            startTime = System.currentTimeMillis();
            while (n <= 3) {
                System.out.println("Guess the number:");
                int guess = sc.nextInt();
                if (guess == guessNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + n + " attempts.");
                    endTime = System.currentTimeMillis();
                    break;
                } else {
                    n++;
                    if (guess > guessNumber){
                        System.out.println("Incorrect! Number is less than " + guess);
                    }else {
                        System.out.println("Incorrect! Number is Greater than " + guess);
                    }
                }
            }
            ellapsedTime = endTime - startTime;
            long seconds = (ellapsedTime/1000)%60;
            long minutes = (ellapsedTime/1000)/60;
            System.out.printf("Time taken : %02d minutes %02d seconds\n", minutes, seconds);
        }
    }
}