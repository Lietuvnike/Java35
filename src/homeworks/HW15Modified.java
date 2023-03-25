package homeworks;

import java.util.Scanner;

public class HW15Modified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's the game begin!");
        String player1;
        String player2;
        String result;

        player1 = player1Input(scanner);
        player2 = player2Input(scanner);
        result = theWinnerIs(player1, player2);
        System.out.println(result);
    }
    public static String player1Input(Scanner scanner){
        String player1 = "";
        System.out.println("Player 1 show: rock, paper, scissors, lizard or spock?");
        player1 = scanner.nextLine().toUpperCase().toLowerCase();
        return player1;
    }
    public static String player2Input(Scanner scanner){
        String player2 = "";
        System.out.println("Player 2 show: rock, paper, scissors, lizard or spock?");
        player2 = scanner.nextLine().toUpperCase().toLowerCase();
        return player2;
    }
    public static String theWinnerIs(String player1, String player2){
        String result = "";
        String draw = "The result is tie";
        String finalM = "";

        if (player1.equals("rock") && player2.equals("spock") || player1. equals("paper") && player2.equals("scissors")) {
            result = player2;
            System.out.println("Player 2 wins");
        } else if (player1.equals("spock") && player2.equals("paper") || player1.equals("scissors") && player2.equals("spock") || player1.equals("lizard") && player2.equals("scissors") || player1.equals("spock") && player2.equals("lizard")) {
            result = player2;
            System.out.println("Player 2 wins");

        } else if (player1.equals("scissors") && player2.equals("rock") || player1.equals("lizard") && player2.equals("rock") || player1.equals("paper") && player2.equals("lizard") || player1.equals("rock") && player2.equals("paper")) {
            result = player2;
            System.out.println("Player 2 wins");
        }else if (player1.equals("paper") && player2.equals("rock") || player1.equals("scissors") && player2.equals("paper") || player1.equals("rock") && player2.equals("scissors") || player1.equals("rock") && player2.equals("lizard")) {
            result = player1;
            System.out.println("Player 1 wins");
        }else if (player1.equals("scissors") && player2.equals("lizard") || player1.equals("spock") && player2.equals("scissors") || player1.equals("spock") && player2.equals("rock") || player1.equals("lizard") && player2.equals("spock")) {
            result = player1;
            System.out.println("Player 1 wins");
        } else if (player1.equals("lizard") && player2.equals("paper") || player1. equals("paper") && player2.equals("spock")) {
            result = player1;
            System.out.println("Player 1 wins");
        }else System.out.println(draw);
        finalM = result + " wins";
        return finalM;
    }
}
