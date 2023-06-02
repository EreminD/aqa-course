package ru.inno.course.serializer.hw;

import java.util.Collection;

public class TestClass {

    public static void main(String[] args) {
        PlayerService service = new PlayerService() {
            @Override
            public Player getPlayerById(int id) {
                return null;
            }

            @Override
            public Collection<Player> getPlayers() {
                return null;
            }

            @Override
            public int createPlayer(String nick) {
                return 0;
            }

            @Override
            public Player deletePlayer(int id) {
                return null;
            }

            @Override
            public int addPoints(int playerId, int points) {
                return 0;
            }
        };

        service.addPoints(1, 12);
        Collection<Player> players = service.getPlayers();
    }
}
