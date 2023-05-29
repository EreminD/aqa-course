package ru.inno.course.collection.homework;

import java.util.*;

public class Playground {

    public static void main(String[] args) {

        Player player1 = new Player(1, "Tester1", true);
        Player player2 = new Player(2, "Tester2", true);
        Player player3 = new Player(3, "Tester3", true);
        Player player4 = new Player(4, "Tester4", true);
        Player player5 = new Player(5, "Tester5", true);
        Player player6 = new Player(6, "Tester6", true);
        Player player7 = new Player(7, "Tester7", true);
        Player player8 = new Player(8, "Tester8", true);
        Player player9 = new Player(9, "Tester9", true);
        Player player10 = new Player(10, "Tester10", true);

        Set<Player> players = new HashSet<>();

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);
        players.add(player10);
        players.add(player10);
        players.add(player10);
        players.add(player10);
        players.add(player10);


        Tournament tournament = new Tournament();
        tournament.addPlayer(player1);
        tournament.addPlayer(player2);
        tournament.addPlayer(player3);
        tournament.addPlayer(player4);

        tournament.addPoints(player1, 10);
        tournament.addPoints(player2, 11);
        tournament.addPoints(player3, 9);
        tournament.addPoints(player4, 12);

        List<PlayerWithPoints> top = tournament.getTop(3);

        System.out.println(top.get(0).getPlayer().getNickname());

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        List<String> list1 = Collections.emptyList();



    }
}
