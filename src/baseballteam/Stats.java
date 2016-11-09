/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballteam;

/**
 * @author aldic2547
 * Date: 09/11/2016
 * Purpose: Calculate total the stats for a team
 */
abstract class Stats {
    
    /**
     * Calculates the total points for a team
     * pre: wins, ties, losses
     * post: total points
     */
    public int overallPoints(int wins,int ties,int losses){
        int points = 0;
        points += wins*2;
        points += ties;
        return points;
    }
    
}
