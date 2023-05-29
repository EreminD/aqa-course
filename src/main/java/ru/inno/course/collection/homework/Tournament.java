package ru.inno.course.collection.homework;

import java.util.*;

public class Tournament {

    private Map<Player, Integer> points;

    public Tournament() {
        points = new HashMap<>();
    }

    public void addPlayer(Player player){
        points.put(player, 0);
    }

    public int addPoints(Player player, int points){
        int currentPoints = this.points.get(player);
        currentPoints += points;
        this.points.put(player, currentPoints);
        return currentPoints;
    }

    public List<PlayerWithPoints> getTop(int X) {
        List<Player> players = this.points.keySet().stream().toList();
        PlayerWithPoints leader = new PlayerWithPoints(null, 0);

        // алгоритм поиска X лучших
        int max = 0;
        for(Player p : players){
            int point = this.points.get(p);
            if (point > max){
                max = point;
                leader = new PlayerWithPoints(p, point);
            }
        }

        List<PlayerWithPoints> list = new ArrayList<>();
        list.add(leader);
        return list;
    }

    // SortedMap
    // PlayerWithPoints

}
