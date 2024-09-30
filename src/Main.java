import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String rock = "R";
        String paper = "P";
        String scissors = "S";
        String play1 = "";
        String play2 = "";
        String playAgain = "";
        boolean playAgainBoo = true;

        while(playAgainBoo == true)
        {
            do
            {
                System.out.println("Enter move for Player 1 (R,P,S): ");
                play1 = in.nextLine();
            }
            while (!(play1.equalsIgnoreCase("R") || play1.equalsIgnoreCase("P") || play1.equalsIgnoreCase("S")));
            do
            {
                System.out.println("Enter move for Player 2 (R,P,S): ");
                play2 = in.nextLine();
            }
            while (!(play2.equalsIgnoreCase("R") || play2.equalsIgnoreCase("P") || play2.equalsIgnoreCase("S")));

            if (play1.equalsIgnoreCase("R") && play2.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs. Rock - It's a tie!");
                }

            if (play1.equalsIgnoreCase("R") && play2.equalsIgnoreCase("P"))
            {
                System.out.println("Rock vs. Paper - Paper covers Rock - Player 2 Wins!");
            }

            if (play1.equalsIgnoreCase("R") && play2.equalsIgnoreCase("S"))
            {
                System.out.println("Rock vs. Scissors - Rock breaks Scissors - Player 1 Wins!");
            }
            ///end of player 1 rock
            if (play1.equalsIgnoreCase("P") && play2.equalsIgnoreCase("R"))
            {
                System.out.println("Paper vs. Rock - Paper covers Rock - Player 1 Wins!");
            }

            if (play1.equalsIgnoreCase("P") && play2.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs. Paper - It's a tie!");
            }

            if (play1.equalsIgnoreCase("P") && play2.equalsIgnoreCase("S"))
            {
                System.out.println("Paper vs. Scissors - Scissors cuts Paper - Player 2 Wins!");
            }
            ///end of player1 Paper
            if (play1.equalsIgnoreCase("S") && play2.equalsIgnoreCase("R"))
            {
                System.out.println("Scissors vs. Rock - Rock breaks Scissors - Player 2 Wins!");
            }

            if (play1.equalsIgnoreCase("S") && play2.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors vs. Paper - Scissors cuts Paper - Player 1 Wins!");
            }

            if (play1.equalsIgnoreCase("S") && play2.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors vs. Scissors - It's a tie!");
            }
            ///end of player1 scissors


            System.out.println("Would you like to play again (Y/N)?");
            playAgain = in.nextLine();
            if(playAgain.equalsIgnoreCase("N"))
            {
                playAgainBoo = false;
            }





        }



    }
}