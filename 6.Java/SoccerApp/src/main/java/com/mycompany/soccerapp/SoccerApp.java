/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soccerapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 *
 * @author Bianca
 */
public class SoccerApp {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line = "start";
        BufferedReader reader;

        String first_team = null;
        String second_team = null;
        String[] split_line = null;
        String[] team_score = null;
        // each line has to be split into these 4 variables:
        String first_team_name = null;
        int first_team_score = 0;
        String second_team_name = null;
        int second_team_score = 0;
        //
        int first_team_league_points = 0;
        int second_team_league_points = 0;
        HashMap<String, Integer> scoreboard = new HashMap<>();
        int num = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Bianca\\Documents\\Bootcamp\\6.Java\\SoccerApp\\src\\main\\java\\com\\mycompany\\soccerapp\\games.txt"));
            line = reader.readLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (line != null) { // at the end of the file - the line variable will be null

            split_line = line.split(",");
            //first half
            first_team = split_line[0];
            team_score = first_team.split(" ");
            first_team_name = team_score[0];
            first_team_score = Integer.parseInt(team_score[1]);
            //second half
            second_team = split_line[1];
            team_score = second_team.split(" ");
            second_team_name = team_score[0];
            second_team_score = Integer.parseInt(team_score[1]);
            System.out.println("\nTeam1 : " + first_team_name + " " + first_team_score + "\tTeam2 : " + second_team_name + " " + second_team_score);

            // 1) Print the winner is : .......... and the loser is   ....... or print it is a draw
            if (first_team_score > second_team_score) {
                first_team_league_points = 3;
                second_team_league_points = 0;
                System.out.println("The winner is " + first_team_name + " and the loser is " + second_team_name + ".");
            } else if (second_team_score > first_team_score) {
                second_team_league_points = 3;
                first_team_league_points = 0;
                System.out.println("The winner is " + second_team_name + " and the loser is " + first_team_name + ".");
            } else {
                first_team_league_points = 1;
                second_team_league_points = 1;
                System.out.println("It's a draw!");
            }

            scoreboard.putIfAbsent(first_team_name, 0);
            scoreboard.putIfAbsent(second_team_name, 0);

            // 2) Update the scoreboard (a hashmap data structure)
            if (scoreboard.containsKey(first_team_name)) {
                scoreboard.put(first_team_name, scoreboard.get(first_team_name) + first_team_league_points);
            }

            if (scoreboard.containsKey(second_team_name)) {
                scoreboard.put(second_team_name, scoreboard.get(second_team_name) + second_team_league_points);
            }

            try {
                line = reader.readLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } // end while

        // Printing out scoreboard
        System.out.println("\nThis is the scoreboard for the league: ");

        Map<String, Integer> sorted_scoreboard = scoreboard.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        
       
        Iterator<Entry<String, Integer>> iterator = sorted_scoreboard.entrySet().iterator();
        while(iterator.hasNext()) {
            num++;
            Entry<String, Integer> entry = iterator.next();
            System.out.println("\n" + num + "." + entry.getKey() + "\n" + entry.getValue());
        }

        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    } // end main
} // end class
