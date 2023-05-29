package ru.inno.course.collection.homework;

import java.util.Objects;

public class PlayerWithPoints {

    private Player player;
    private Integer points;

    public PlayerWithPoints(Player player, Integer points) {
        this.player = player;
        this.points = points;
    }

    public Player getPlayer() {
        return player;
    }

    public Integer getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerWithPoints that)) return false;
        return Objects.equals(getPlayer(), that.getPlayer()) && Objects.equals(getPoints(), that.getPoints());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayer(), getPoints());
    }

    @Override
    public String toString() {
        return "PlayerWithPoints{" +
                "player=" + player +
                ", points=" + points +
                '}';
    }
}
