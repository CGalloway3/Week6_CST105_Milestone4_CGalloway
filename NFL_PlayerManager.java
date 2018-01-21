//This is my own work. Chad Galloway
/**  Program: NFL Draft Planner
*    File: NFL_PlayerManager.java
*    Summary: Player manager class to be used in NFL Draft Planner application.
*    Author: Chad Galloway 
*    Date: Jan. 20, 2018
**/

package NFL_PlayerManagerClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class NFL_PlayerManager {

    // Private fields
    private ArrayList avaliblePlayers = new ArrayList();
    private ArrayList selectedPlayers = new ArrayList();

    // Public Constructors
    public NFL_PlayerManager(NFL_Player... players) {
        for (int i = 0; i < players.length; i++) {
            this.avaliblePlayers.add(players[i]);
        }
    }
    public NFL_PlayerManager() {
    }

    // Public methods
    public void createPlayers() {
        Offensive_NFL_Player player1 = new Offensive_NFL_Player("Travis Kelce", LocalDate.of(1989, 10, 5), 79f, 260f, "Westlake, OH", 87, "TE", "Cincinnati", 5, 15, 0, 83, 1038, "44", 8, 0, 55, 19, 1);
        Offensive_NFL_Player player2 = new Offensive_NFL_Player("Tom Brady", LocalDate.of(1977, 8, 3), 76f, 225f, "San Mateo, CA", 12, "QB", "Michigan", 18, 16, 581, 385, 4577, "64T", 32, 8, 230, 62, 10);
        Offensive_NFL_Player player3 = new Offensive_NFL_Player("Ezekiel Elliott", LocalDate.of(1995, 7, 22), 72f, 228f, "Alton, IL", 21, "RB", "Ohio State", 2, 10, 242, 0, 963, "30", 7, 1, 55, 5, 0);
        Offensive_NFL_Player player4 = new Offensive_NFL_Player("Jarvis Landry", LocalDate.of(1992, 11, 28), 71f, 208f, "Metaire, LA", 14, "WR", "LSU", 4, 16, 0, 112, 987, "49", 9, 3, 60, 6, 1);
        Defensive_NFL_Player player5 = new Defensive_NFL_Player("Reshad Jones", LocalDate.of(1988, 2, 25), 73f, 223f, "Atlanta, GA", 20, "FS", "Georgia", 8, 16, 94, 28, 1.5f, 0, 7, 2, 0, 15, "15", 0, 3, 2);
        Defensive_NFL_Player player6 = new Defensive_NFL_Player("Khalil Mack", LocalDate.of(1991, 2, 22), 75f, 250f, "Fort Pierce, FL", 52, "DE", "Buffalo", 4, 16, 61, 17, 10.5f, 0, 0, 0, 0, 0, "0", 1, 1, 0);
        avaliblePlayers.add(player1);
        avaliblePlayers.add(player2);
        avaliblePlayers.add(player3);
        avaliblePlayers.add(player4);
        avaliblePlayers.add(player5);
        avaliblePlayers.add(player6);
    }
    public void selectPlayer(int playersNumber) {
        NFL_Player player;
        for (int i = 0; i < avaliblePlayers.size(); i++) {
            player = (NFL_Player) avaliblePlayers.get(i);
            if (player.getPlayersNumber() == playersNumber) {
                avaliblePlayers.remove(i);
                selectedPlayers.add(player);
            }
        }
    }
    public void removePlayer(int playersNumber) {
        NFL_Player player;
        for (int i = 0; i < selectedPlayers.size(); i++) {
            player = (NFL_Player) selectedPlayers.get(i);
            if (player.getPlayersNumber() == playersNumber) {
                selectedPlayers.remove(i);
                avaliblePlayers.add(player);
            }
        }
    }
    public void viewPlayerStatDetails(NFL_Player player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        NFL_Player player;
        String returnString = "";
        returnString += avaliblePlayers.size() + " total avalible players remaining.\n";
        for (int i = 0; i < avaliblePlayers.size(); i++) {
            player = (NFL_Player) avaliblePlayers.get(i);
            returnString += player.getPlayersNumber() + " " + player.getPlayersPosition() + " " + player.getName() + "\n";
        }
        returnString += "\n" + selectedPlayers.size() + " total players selected for the team.\n";
        for (int i = 0; i < selectedPlayers.size(); i++) {
            player = (NFL_Player) selectedPlayers.get(i);
            returnString += player.getPlayersNumber() + " " + player.getPlayersPosition() + " " + player.getName() + "\n";
        }
        return returnString;
    }
}
