/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballteam;

/**
 * @author aldic2547
 * Date:09/11/2016
 */
abstract class Sports {
    
    String teamName,coachName;
    int playerCount,totWins,totTies,totLosses;
    
    /**
     * constructor
     * pre:Team Name, Coach Name, Player Count, Total Wins, Total Losses, Total Ties
     * post: None
     */
    
    public Sports(String teamName,String coachName,int playerCount,int totWins,int totTies,int totLosses){
        this.teamName = teamName;
        this.coachName = coachName;
        this.playerCount = playerCount;
        this.totWins = totWins;
        this.totTies = totTies;
        this.totLosses = totLosses;
    }
    
    
    
    public abstract String toString();
}
