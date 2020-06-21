package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TernaryIntPredicate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");

        //Set<Integer> set1 = new HashSet<Integer>((Collection<? extends Integer>) Arrays.asList(sets[0].split(" ")));
        //your code(add elements to set1 from sets[0])

        Set<Integer> set2;
        //your code(add elements to set2 from sets[1])

        Set<Integer> set3;
        //your code(add elements to set3 from sets[2])


        //Set<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);

        //print elements of resultTreeSet(using System.out.printLn()) below

    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3){
        TreeSet<Integer> resultSet = new TreeSet<>();

        return resultSet;
    }
    //public boolean test( int firstArg, int secondArg, int thirdArg);
// Write a method here
    /*public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        String[][] inputs = new String[n][4];
        List<String> teams = new ArrayList<String>();
        List<Integer> totalGames = new ArrayList<Integer>();
        List<Integer> wins = new ArrayList<Integer>();
        List<Integer> draws = new ArrayList<Integer>();
        List<Integer> defeats = new ArrayList<Integer>();
        List<Integer> totalPoints = new ArrayList<Integer>();
        int indexOfFirst = 0, indexOfSecond = 0;


        for (int i = 0; i < n; i++) {
            String[] input = reader.nextLine().split(";");
            inputs[i] = input;
        }

        for (int i = 0; i < inputs.length; i++) {
            teams.add(inputs[i][0]);
            teams.add(inputs[i][2]);
        }

        for (int i = 0; i < teams.size() - 1; i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                if (teams.get(i).equals(teams.get(j))) {
                    teams.remove(j);
                }
            }
        }

        for (int i = 0; i < teams.size(); i++) {
            totalGames.add(i, 0);
            wins.add(i, 0);
            draws.add(i, 0);
            defeats.add(i, 0);
            totalPoints.add(i, 0);
        }


        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < teams.size(); j++) {
                if (teams.get(j).equals(inputs[i][0])) indexOfFirst = j;
                else if (teams.get(j).equals(inputs[i][2])) indexOfSecond = j;
            }
            System.out.println((indexOfFirst));
            System.out.println((indexOfSecond));
            System.out.println("indexes all");
            if (Integer.parseInt(inputs[i][1]) > Integer.parseInt(inputs[i][3])) {
                wins.add(indexOfFirst, wins.get(indexOfFirst) + 1);
                defeats.add(indexOfSecond, defeats.get(indexOfSecond) + 1);
            } else if (Integer.parseInt(inputs[i][1]) < Integer.parseInt(inputs[i][3])) {
                wins.add(indexOfSecond, wins.get(indexOfSecond) + 1);
                defeats.add(indexOfFirst, defeats.get(indexOfFirst) + 1);
            } else if (Integer.parseInt(inputs[i][1]) == Integer.parseInt(inputs[i][3])) {
                draws.add(indexOfFirst, draws.get(indexOfFirst) + 1);
                draws.add(indexOfSecond, draws.get(indexOfSecond) + 1);
            }
            totalGames.add(indexOfFirst, totalGames.get(indexOfFirst)+1);

            totalGames.add(indexOfSecond, totalGames.get(indexOfSecond)+1);
            totalPoints.add(indexOfFirst, totalPoints.get(indexOfFirst) + Integer.parseInt(inputs[i][1]));

            totalPoints.add(indexOfSecond, totalPoints.get(indexOfSecond) + Integer.parseInt(inputs[i][3]));


            System.out.println(teams.get(indexOfFirst) + ":" + totalGames.get(indexOfFirst) + " " + wins.get(indexOfFirst) + " " + draws.get(indexOfFirst) + " "
                    + defeats.get(indexOfFirst) + " " + totalPoints.get(indexOfFirst));
            System.out.println(teams.get(indexOfSecond) + ":" + totalGames.get(indexOfSecond) + " " + wins.get(indexOfSecond) + " " + draws.get(indexOfSecond) + " "
                    + defeats.get(indexOfSecond) + " " + totalPoints.get(indexOfSecond));
            for (int l: totalPoints) {
                System.out.println(l);
            }
            System.out.println("points all");

        }

        for (int j = 0; j < teams.size(); j++) {
            System.out.println(teams.get(j) + ":" + totalGames.get(j) + " " + wins.get(j) + " " + draws.get(j) + " " + defeats.get(j) + " " + totalPoints.get(j));
        }

    }*/
}

//public static final TernaryIntPredicate allValuesAreDifferentPredicate = (int a, int b, int c) -> (a != b) && (b != c);// Write a lambda expression here