package com.example.preferanscounter.classes;

public class Game {

    protected int playersNumber;

    protected Player[] players;

    public Game(int playersCount) {
        this.playersNumber = playersCount;
        this.players = new Player[playersNumber];
        for (int i = 0; i < playersNumber;i++) {
            players[i] = new Player(i, playersNumber);
        }
    }

    public Player getPlayer(int playerNumber) {
        int id = playerNumber - 1;
        return players[id];
    }

    public void calculate() {
        calculateMountain();
        calculateWhists();
    }

    private void calculateWhists() {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = i + 1; j < players.length; j++) {
                calculateWhists(players[i],players[j]);
            }
        }
    }

    private void calculateWhists(Player p1, Player p2) {
        int id1 = p1.getId();
        int id2 = p2.getId();
        int whist1 = p1.getWhist(id2);
        int whist2 = p2.getWhist(id1);
        int whistsDifference = Math.abs(whist1 - whist2);
        if (whist1 > whist2) {
            p1.addToResult(whistsDifference);
            p2.addToResult(-1 * whistsDifference);
        } else {
            p1.addToResult(-1 * whistsDifference);
            p2.addToResult(whistsDifference);
        }
    }

    private void calculateMountain() {
        int mountainSum = 0;
        for (Player p : players)  {
            mountainSum += p.getMountainPoints();
        }

        // TODO если не делится поровну, то надо делать небольшой пересчет
        int mountainPointsPerPlayer = mountainSum / this.playersNumber;

        for (Player p: players) {
            int playerMountain = p.getMountainPoints();
            p.addToResult((mountainPointsPerPlayer - playerMountain) * 10);
        }
    }
}
