/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soccerapp;

/**
 *
 * @author Bianca
 */
public class Game {

    private String team1;
    private int team1Score;
    private String team2;
    private int team2Score;

    public Game(String team1, int team1Score, String team2, int team2Score) {
        this.team1 = team1;
        this.team1Score = team1Score;
        this.team2 = team2;
        this.team2Score = team2Score;
    }

    /**
     * @return the team1
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * @param team1 the team1 to set
     */
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    /**
     * @return the team1Score
     */
    public int getTeam1Score() {
        return team1Score;
    }

    /**
     * @param team1Score the team1Score to set
     */
    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    /**
     * @return the team2
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * @param team2 the team2 to set
     */
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    /**
     * @return the team2Score
     */
    public int getTeam2Score() {
        return team2Score;
    }

    /**
     * @param team2Score the team2Score to set
     */
    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }

}
