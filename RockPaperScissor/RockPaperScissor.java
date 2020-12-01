import java.util.Scanner;

public class RockPaperScissor {
    public static final String RESET = "\033[0m";  // Text Reset


    //COLORS FOR TERMINALS************
    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

   

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
    //COLORS FOR TERMINALS************

    static String getOpponentData(){
        String data[] = {"stone", "paper", "scissor"};
        int random = (int)(Math.random()*(2-0+1)+0);
        return data[random];
    }
    static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String []args){
        clearScreen();
        int ch, userScore = 0, computerScore = 0, playAgain;
        String opponentData;
        Scanner sc = new Scanner(System.in);
        //Menu for getting user input
        do{
            clearScreen();
            int chances = 5;
            do{
            System.out.println( RockPaperScissor.YELLOW_BOLD_BRIGHT + "*****STONE PAPER SCISSOR*****" + RockPaperScissor.RESET);
            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT +"*******CHANCES LEFT: " + chances + "*********" + RockPaperScissor.RESET);
            System.out.println(RockPaperScissor.CYAN_BOLD_BRIGHT + "Enter Your Choice" + RockPaperScissor.RESET);
            System.out.println(RockPaperScissor.GREEN_BOLD_BRIGHT + "1. Stone" + RockPaperScissor.RESET);
            System.out.println(RockPaperScissor.RED_BOLD_BRIGHT + "2. Paper" + RockPaperScissor.RESET );
            System.out.println( RockPaperScissor.BLUE_BOLD_BRIGHT  + "3. Scissor" + RockPaperScissor.RESET );
            System.out.print(RockPaperScissor.GREEN_BOLD_BRIGHT + "Your choice: ");
            chances--;
            ch = sc.nextInt();
            System.out.print(RockPaperScissor.RESET);
            System.out.println();
            switch(ch){
                case 1:
                    System.out.println(RockPaperScissor.BLUE_BOLD_BRIGHT + "You selected Stone!" + RockPaperScissor.RESET );
                    opponentData = getOpponentData();
                    switch(opponentData){
                        case "stone":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer also selected Stone" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "Oh! It was a tie!" + RockPaperScissor.RESET);
                            break;
                        case "paper":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer selected Paper!" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "Computer wrapped your Stone into paper, Computer won!!" + RockPaperScissor.RESET);
                            computerScore++;
                            break;
                        case "scissor":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer selected Scissor" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "You punched the Computer's Scissor with Your Rock!, You Won!" + RockPaperScissor.RESET);
                            userScore++;
                            break;
                    }
                break;
    
                case 2:
                System.out.println(RockPaperScissor.BLUE_BOLD_BRIGHT + "You selected Paper!" + RockPaperScissor.RESET );
                    opponentData = getOpponentData();
                    switch(opponentData){
                        case "stone":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer selected Stone" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "Your paper wrapped the stone and crushed it, You won!" + RockPaperScissor.RESET);
                            userScore++;
                            break;
                        case "paper":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer also selected paper!" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "Oh! It was a tie!" + RockPaperScissor.RESET);
                            break;
                        case "scissor":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer selected Scissor" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "Computer's Scissor turned your paper into small pieces!, Computer won!" + RockPaperScissor.RESET);
                            computerScore++;
                            break;
                    }
                break;
    
                case 3:
                System.out.println(RockPaperScissor.BLUE_BOLD_BRIGHT + "You selected Scissor!" + RockPaperScissor.RESET );
                    opponentData = getOpponentData();
                    switch(opponentData){
                        case "stone":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer selected Stone" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "Computer's stone punched your scissor and took a point, Computer won!" + RockPaperScissor.RESET);
                            computerScore++;
                            break;
                        case "paper":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer selected paper!" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "Your scissor turned computer's paper into bits and pieces, You won!!" + RockPaperScissor.RESET);
                            userScore++;
                            break;
                        case "scissor":
                            System.out.println(RockPaperScissor.YELLOW_BOLD_BRIGHT + "Computer also selected Scissor" + RockPaperScissor.RESET);
                            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT + RockPaperScissor.WHITE_BOLD_BRIGHT +  "Oh! It was a tie!" + RockPaperScissor.RESET);
                            break;
                    }
                break;
    
                default:
                    System.out.println(RockPaperScissor.WHITE_BOLD_BRIGHT + "I think you are a robot and you are so bored");
                    System.out.println("that you decided to play stone paper scissor!");
                    System.out.println("But select only from the options given above"+ RockPaperScissor.RESET);
    
            }
            System.out.println();
    
            }while(chances > 0);
            if(computerScore > userScore){
                System.out.println( RockPaperScissor.RED_BOLD_BRIGHT + "Computer scored " + RockPaperScissor.WHITE_BOLD_BRIGHT +  computerScore + RockPaperScissor.RED_BOLD_BRIGHT + " out of 5" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.YELLOW_BOLD_BRIGHT +  "You Scored " + RockPaperScissor.WHITE_BOLD_BRIGHT + userScore + RockPaperScissor.YELLOW_BOLD_BRIGHT + " out of 5" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.CYAN_BOLD_BRIGHT +  "Remaining was a tie" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.GREEN_BOLD_BRIGHT + "COMPUTER WON THE GAME" + RockPaperScissor.RESET);
            }else if(computerScore < userScore){
                System.out.println( RockPaperScissor.RED_BOLD_BRIGHT + "Computer scored " + RockPaperScissor.WHITE_BOLD_BRIGHT +  computerScore + RockPaperScissor.RED_BOLD_BRIGHT + " out of 5" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.YELLOW_BOLD_BRIGHT +  "You Scored " + RockPaperScissor.WHITE_BOLD_BRIGHT + userScore + RockPaperScissor.YELLOW_BOLD_BRIGHT + " out of 5" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.CYAN_BOLD_BRIGHT +  "Remaining was a tie" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.GREEN_BOLD_BRIGHT + "YOU WON THE GAME" + RockPaperScissor.RESET);
            }
            else{
                System.out.println( RockPaperScissor.RED_BOLD_BRIGHT + "Computer scored " + RockPaperScissor.WHITE_BOLD_BRIGHT +  computerScore + RockPaperScissor.RED_BOLD_BRIGHT + " out of 5" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.YELLOW_BOLD_BRIGHT +  "You Scored " + RockPaperScissor.WHITE_BOLD_BRIGHT + userScore + RockPaperScissor.YELLOW_BOLD_BRIGHT + " out of 5" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.CYAN_BOLD_BRIGHT +  "Remaining was a tie" + RockPaperScissor.RESET);
                System.out.println( RockPaperScissor.GREEN_BOLD_BRIGHT + "GAME IS TIED BETWEEN YOU AND COMPUTER" + RockPaperScissor.RESET);
            }
            System.out.println(RockPaperScissor.BLACK_BOLD_BRIGHT);
            System.out.println("Want to play again!" + RockPaperScissor.RESET);
            System.out.println(RockPaperScissor.WHITE_BOLD_BRIGHT + "1. Yes, lets Rock with stone & paper");
            System.out.println("2. Next time!" + RockPaperScissor.RESET);
            playAgain = sc.nextInt();
            userScore = 0;
            computerScore = 0;
            if(playAgain == 2){
                System.out.println("Bye!!");
            }
        }while(playAgain != 2);
        sc.close();
    }
}
