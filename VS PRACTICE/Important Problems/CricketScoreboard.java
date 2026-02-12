import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class CricketScoreboard {
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();
    
    private static String team1Name, team2Name;
    private static ArrayList<String> team1Players = new ArrayList<>();
    private static ArrayList<String> team2Players = new ArrayList<>();
    private static int totalOvers;
    private static String tossWinner, tossLoser;
    private static String userChoice;
    private static ArrayList<String> battingTeamPlayers, bowlingTeamPlayers;
    
    public static void main(String[] args) {
        System.out.println("===== CRICKET SCOREBOARD GAME =====\n");
        
        teamSelection();
        performToss();
        getOvers();
        chooseBattingOrBowling();
        playMatch();
        
        sc.close();
    }
    
    private static void teamSelection() {
        System.out.print("Enter Team 1 name: ");
        team1Name = sc.nextLine();
        
        String[] defaultPlayers1 = {
            "Rohit Sharma", "Virat Kohli", "Shubman Gill", "KL Rahul",
            "Hardik Pandya", "Ravindra Jadeja", "MS Dhoni", "Ravichandran Ashwin",
            "Jasprit Bumrah", "Mohammed Shami", "Yuzvendra Chahal"
        };
        
        for (String player : defaultPlayers1) {
            team1Players.add(player);
        }
        
        System.out.println("Players for " + team1Name + ": " + String.join(", ", team1Players));
        
        System.out.print("\nEnter Team 2 name: ");
        team2Name = sc.nextLine();
        
        String[] defaultPlayers2 = {
            "Babar Azam", "Mohammad Rizwan", "Fakhar Zaman", "Shadab Khan",
            "Shaheen Afridi", "Haris Rauf", "Naseem Shah", "Mohammad Nawaz",
            "Iftikhar Ahmed", "Hasan Ali", "Imad Wasim"
        };
        
        for (String player : defaultPlayers2) {
            team2Players.add(player);
        }
        
        System.out.println("Players for " + team2Name + ": " + String.join(", ", team2Players));
        
        System.out.println("\n" + team1Name + " vs " + team2Name + "\n");
    }
    
    private static void performToss() {
        System.out.println("Tossing the coin...");
        int tossResult = rand.nextInt(2);
        
        if (tossResult == 0) {
            tossWinner = team1Name;
            tossLoser = team2Name;
        } else {
            tossWinner = team2Name;
            tossLoser = team1Name;
        }
        
        System.out.println(tossWinner + " won the toss!\n");
    }
    
    private static void getOvers() {
        System.out.print("Enter total overs for the match: ");
        totalOvers = sc.nextInt();
        sc.nextLine();
        System.out.println();
    }
    
    private static void chooseBattingOrBowling() {
        System.out.println(tossWinner + " won the toss. Choose batting or bowling:");
        System.out.print("Enter 'bat' or 'bowl': ");
        userChoice = sc.nextLine().toLowerCase();
        
        while (!userChoice.equals("bat") && !userChoice.equals("bowl")) {
            System.out.print("Invalid choice! Enter 'bat' or 'bowl': ");
            userChoice = sc.nextLine().toLowerCase();
        }
        
        System.out.println("\n" + tossWinner + " chose to " + userChoice + "!\n");
    }
    
    private static void playMatch() {
        String firstBattingTeam, secondBattingTeam;
        ArrayList<String> firstBattingPlayers, secondBattingPlayers;
        
        if (userChoice.equals("bat")) {
            firstBattingTeam = tossWinner;
            secondBattingTeam = tossLoser;
            firstBattingPlayers = tossWinner.equals(team1Name) ? team1Players : team2Players;
            secondBattingPlayers = tossLoser.equals(team1Name) ? team1Players : team2Players;
        } else {
            firstBattingTeam = tossLoser;
            secondBattingTeam = tossWinner;
            firstBattingPlayers = tossLoser.equals(team1Name) ? team1Players : team2Players;
            secondBattingPlayers = tossWinner.equals(team1Name) ? team1Players : team2Players;
        }
        
        System.out.println("===== FIRST INNINGS =====");
        System.out.println(firstBattingTeam + " is batting\n");
        int firstInningsScore = playInnings(firstBattingPlayers, firstBattingTeam, -1);
        
        System.out.println("\n" + firstBattingTeam + " scored: " + firstInningsScore + " runs\n");
        System.out.println("------- INNINGS BREAK -------\n");
        
        System.out.println("===== SECOND INNINGS =====");
        System.out.println(secondBattingTeam + " is batting");
        System.out.println("Target: " + (firstInningsScore + 1) + " runs\n");
        int secondInningsScore = playInnings(secondBattingPlayers, secondBattingTeam, firstInningsScore);
        
        System.out.println("\n" + secondBattingTeam + " scored: " + secondInningsScore + " runs\n");
        
        displayResult(firstInningsScore, secondInningsScore, firstBattingTeam, secondBattingTeam);
    }
    
    private static int playInnings(ArrayList<String> players, String teamName, int target) {
        int totalScore = 0;
        int wickets = 0;
        int maxWickets = 10;
        int totalBalls = totalOvers * 6;
        int ballsPlayed = 0;
        int strikerIndex = 0;
        int nonStrikerIndex = 1;
        
        int[] playerScores = new int[11];
        boolean[] playerOut = new boolean[11];
        
        System.out.println("HOW TO PLAY:");
        System.out.println("- Enter a number between 0 and 6");
        System.out.println("- Computer will generate a random number (0-6)");
        System.out.println("- If numbers match, batsman is OUT!");
        System.out.println("- If numbers don't match, you score the number you chose\n");
        
        while (ballsPlayed < totalBalls && wickets < maxWickets) {
            if (target != -1 && totalScore > target) {
                System.out.println("\nTARGET ACHIEVED!");
                break;
            }
            
            int currentOver = ballsPlayed / 6;
            int ballInOver = ballsPlayed % 6;
            
            String striker = players.get(strikerIndex);
            String nonStriker = players.get(nonStrikerIndex);
            
            System.out.println("\nOver " + currentOver + "." + ballInOver + " | Score: " + totalScore + "/" + wickets);
            if (target != -1) {
                System.out.println("Need: " + (target - totalScore + 1) + " runs");
            }
            System.out.println("Batsman: " + striker + " (" + playerScores[strikerIndex] + "*)");
            System.out.println("Non-Striker: " + nonStriker + " (" + playerScores[nonStrikerIndex] + ")");
            
            System.out.print("\nEnter your shot (0-6): ");
            int userShot = sc.nextInt();
            
            while (userShot < 0 || userShot > 6) {
                System.out.print("Invalid! Enter between 0-6: ");
                userShot = sc.nextInt();
            }
            
            int computerShot = rand.nextInt(7);
            System.out.println("Computer bowled: " + computerShot);
            
            if (userShot == computerShot) {
                wickets++;
                playerOut[strikerIndex] = true;
                System.out.println("\nOUT! " + striker + " is out for " + playerScores[strikerIndex] + " runs");
                System.out.println("Wickets: " + wickets + "/" + maxWickets);
                
                if (wickets >= maxWickets) {
                    System.out.println("\nAll out!");
                    break;
                }
                
                strikerIndex = getNextBatsman(playerOut);
                
            } else {
                totalScore += userShot;
                playerScores[strikerIndex] += userShot;
                System.out.println("Runs scored: " + userShot);
                
                if (target != -1 && totalScore > target) {
                    System.out.println("\nTARGET ACHIEVED!");
                    break;
                }
                
                if (userShot % 2 == 1) {
                    int temp = strikerIndex;
                    strikerIndex = nonStrikerIndex;
                    nonStrikerIndex = temp;
                }
            }
            
            ballsPlayed++;
            
            if (ballInOver == 5) {
                int temp = strikerIndex;
                strikerIndex = nonStrikerIndex;
                nonStrikerIndex = temp;
            }
        }
        
        System.out.println("\n===== SCORECARD - " + teamName + " =====");
        for (int i = 0; i < 11; i++) {
            if (playerScores[i] > 0 || playerOut[i]) {
                String status = playerOut[i] ? "OUT" : "NOT OUT";
                System.out.println(players.get(i) + ": " + playerScores[i] + " (" + status + ")");
            }
        }
        System.out.println("Total: " + totalScore + "/" + wickets);
        System.out.println("Overs: " + (ballsPlayed / 6) + "." + (ballsPlayed % 6));
        
        return totalScore;
    }
    
    private static int getNextBatsman(boolean[] playerOut) {
        for (int i = 0; i < playerOut.length; i++) {
            if (!playerOut[i]) {
                return i;
            }
        }
        return 0;
    }
    
    private static void displayResult(int score1, int score2, String team1, String team2) {
        System.out.println("\n===== MATCH RESULT =====");
        System.out.println(team1 + ": " + score1 + " runs");
        System.out.println(team2 + ": " + score2 + " runs");
        System.out.println();
        
        if (score2 > score1) {
            int wicketsRemaining = 10 - getWickets(score2);
            System.out.println(team2 + " WON by " + wicketsRemaining + " wickets!");
        } else if (score1 > score2) {
            System.out.println(team1 + " WON by " + (score1 - score2) + " runs!");
        } else {
            System.out.println("MATCH TIED!");
        }
        
        System.out.println("========================");
    }
    
    private static int getWickets(int score) {
        return 0;
    }
}