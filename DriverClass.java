//This is my own work. Chad Galloway
/**  Program: NFL Draft Planner
*    File: DriverClass.java
*    Summary: Testing driver for use with classes to be used in NFL Draft Planner application.
*    Author: Chad Galloway 
*    Date: Jan. 20, 2018
**/

package NFL_PlayerManagerClass;

import java.time.LocalDate;
import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        
        // Player class testing
        System.out.println("//** Offensive and Defensive player class testing. **//");
        System.out.println("");

        // Constructor tests with toString tests
        Offensive_NFL_Player playerA = new Offensive_NFL_Player("Travis Kelce", LocalDate.of(1989, 10, 5), 79f, 260f, "Westlake, OH", 87, "TE", "Cincinnati", 5, 15, 0, 83, 1038, "44", 8, 0, 55, 19, 1);
        System.out.println("// Constructor tests with toString() tests");
        System.out.println(playerA.toString());
        System.out.println("");
        
        // Default constructor testing
        Defensive_NFL_Player playerB = new Defensive_NFL_Player();
        System.out.println("// Default constructor tests with toString() tests");
        System.out.println(playerB.toString());
        System.out.println("");
        
        // set accessor tests on blank default constructor player
        playerB.setDOB(LocalDate.of(1972, 6, 27));
        playerB.setBirthPlace("Aurora, IL");
        playerB.setPlayersNumber(99);
        playerB.setHeight(71f);
        playerB.setWeight(190f);
        playerB.setName("Chad Galloway");
        playerB.setCollegeAttended("Grand Canyon University");
        System.out.println("// Set accessor tests using default constructor object");
        System.out.println(playerB.toString());
        System.out.println("");
        
        //test get accessors
        System.out.println("// Get accessor tests");
        System.out.print(playerA.getName());
        System.out.print(", yards: " + playerA.getYards());
        System.out.print(", receptions: " + playerA.getReceptions());
        System.out.print(", average yards: " + String.format("%.1f", playerA.getAverageYards()));
        System.out.print(", games: " + playerA.getGamesPlayed());
        System.out.print(", yards/game: " + String.format("%.1f", playerA.getYardsPerGame()));
        System.out.print(", first down percentage: " + String.format("%.1f", playerA.getFirstDownPercentage() * 100 ));
        System.out.println(", TOUCHDOWNS!!!: " + playerA.getTouchdowns());
        System.out.println("");
        
        
        // test age calculations
        System.out.println("// Test age calculations");
        System.out.print("Today is: " + LocalDate.now());
        playerB.setDOB(LocalDate.of(2000, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth()));
        System.out.print(", if I was born on this day in the year 2000 I would be: " + playerB.getAge());
        playerB.setDOB(LocalDate.of(2000, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth() + 1 ));        
        System.out.println(" today, but it I was born a day later I would only be: " + playerB.getAge() + " right now.");
        System.out.println("");
       
        
        // Player manager class testing
        System.out.println("//** Player manager class testing. **//");
        System.out.println("");

        // Default constructor with toString tests
        System.out.println("// Default constructor with toString tests");
        NFL_PlayerManager playerManager2 = new NFL_PlayerManager();
        System.out.println(playerManager2.toString());
        
        // Constructor with args and a toString() tests
        System.out.println("// Constructor with args and a toString() tests");
        Offensive_NFL_Player player1 = new Offensive_NFL_Player("Travis Kelce", LocalDate.of(1989, 10, 5), 79f, 260f, "Westlake, OH", 87, "TE", "Cincinnati", 5, 15, 0, 83, 1038, "44", 8, 0, 55, 19, 1);
        Offensive_NFL_Player player2 = new Offensive_NFL_Player("Tom Brady", LocalDate.of(1977, 8, 3), 76f, 225f, "San Mateo, CA", 12, "QB", "Michigan", 18, 16, 581, 385, 4577, "64T", 32, 8, 230, 62, 10);
        Offensive_NFL_Player player3 = new Offensive_NFL_Player("Ezekiel Elliott", LocalDate.of(1995, 7, 22), 72f, 228f, "Alton, IL", 21, "RB", "Ohio State", 2, 10, 242, 0, 963, "30", 7, 1, 55, 5, 0);
        Offensive_NFL_Player player4 = new Offensive_NFL_Player("Jarvis Landry", LocalDate.of(1992, 11, 28), 71f, 208f, "Metaire, LA", 14, "WR", "LSU", 4, 16, 0, 112, 987, "49", 9, 3, 60, 6, 1);
        Defensive_NFL_Player player5 = new Defensive_NFL_Player("Reshad Jones", LocalDate.of(1988, 2, 25), 73f, 223f, "Atlanta, GA", 20, "FS", "Georgia", 8, 16, 94, 28, 1.5f, 0, 7, 2, 0, 15, "15", 0, 3, 2);
        Defensive_NFL_Player player6 = new Defensive_NFL_Player("Khalil Mack", LocalDate.of(1991, 2, 22), 75f, 250f, "Fort Pierce, FL", 52, "DE", "Buffalo", 4, 16, 61, 17, 10.5f, 0, 0, 0, 0, 0, "0", 1, 1, 0);
        NFL_PlayerManager playerManager = new NFL_PlayerManager(player1, player2, player3, player4, player5, player6);
        System.out.println(playerManager.toString());
        
        // Player selection tests
        System.out.println("// Player selection tests");
        System.out.print("Enter the number of the player from above you want to select: ");
        playerManager.selectPlayer(inputScanner.nextInt());
        System.out.println(playerManager.toString());
        System.out.println("\"Press enter to continue\"");
        inputScanner.nextLine();
        inputScanner.nextLine();
        
        // Player removal tests
        System.out.println("// Player removal tests");
        playerManager.selectPlayer(87);
        playerManager.selectPlayer(12);
        playerManager.selectPlayer(21);
        playerManager.selectPlayer(20);
        playerManager.selectPlayer(14);
        playerManager.selectPlayer(52);
        System.out.println(playerManager.toString());
        System.out.print("I have added all the players to your team, please select one from above to remove: ");
        playerManager.removePlayer(inputScanner.nextInt());
        System.out.println(playerManager.toString());
        System.out.println("\"Press enter to continue\"");
        inputScanner.nextLine();
        inputScanner.nextLine();
        
        // createPlayers tests
        System.out.println("// createPlayers tests");
        System.out.println(playerManager2.toString());
        playerManager2.createPlayers();
        System.out.println(playerManager2.toString());
    }
}
