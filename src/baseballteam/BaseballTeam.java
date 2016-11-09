/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballteam;

/**
 * @author aldic2547
 * Date: 09/11/2016
 * Purpose: Create a baseball team
 */
public class BaseballTeam extends Sports implements Stats{

    
    
    /**
     * constructor
     * pre:Team Name, Coach Name, Player Count, Total Wins, Total Losses, Total Ties
     * post: None
     */
    public BaseballTeam(String teamName, String coachName, int playerCount, int totWins, int totTies, int totLosses) {
        super(teamName, coachName, playerCount, totWins, totTies, totLosses);
    }

    @Override
    public String toString() {
       return ("TeamName: " + teamName
               +"\nCoachName: " + coachName +
               "\nPlayer Count: " + playerCount + 
               "\nTotal Wins: " + totWins +
               "\nTotal Ties: " + totTies +
               "\nTotal Losses: " + totLosses +
               "\nTotal Overall Points: " + overallPoints(totWins, totTies, totTies));
    }   

    public int overallPoints(int wins, int ties, int losses) {
        int points = 0;
        points += wins*2;
        points += ties;
        return points;
    }
}
