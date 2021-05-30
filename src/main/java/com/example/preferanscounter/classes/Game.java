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

    public Player getPlayer(int id) {
        return players[id];
    }


    public void calculate() {
        calculateMountain();

    }

    private void calculateWhists() {

    }

    private void calculateMountain() {
        int mountainSum = this.calculateMountainSum();
        int mountainPointsPerPlayer = mountainSum / this.playersNumber;

        for (Player p: players) {
            int playerMountain = p.getMountainPoints();
            p.addToResult((playerMountain - mountainPointsPerPlayer) * 10);
        }
    }

    private int calculateMountainSum() {
        int sum = 0;
        for (Player p : players)  {
            sum += p.getMountainPoints();
        }
        return  sum;
    }
}
