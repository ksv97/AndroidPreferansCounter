package com.example.preferanscounter.classes;

public class Player {
    private int id;
    private int bulletPoints;
    private int mountainPoints;
    private int[] whists;
    private int result;

    public Player() {}

    public Player (int id, int playersCount) {
        this.id  = id;
        whists = new int[playersCount];
    }

    public int getBulletPoints() {
        return bulletPoints;
    }

    public void setBulletPoints(int bulletPoints) {
        this.bulletPoints = bulletPoints;
    }

    public int getMountainPoints() {
        return mountainPoints;
    }

    public void setMountainPoints(int mountainPoints) {
        this.mountainPoints = mountainPoints;
    }

    public int getId() {
        return id;
    }

    public int[] getWhists() {
        return whists;
    }

    public int getWhist(int playerId) { return whists[playerId]; }

    public void setWhist(int playerNumber, int value) {
        whists[playerNumber - 1] = value;
    }

    public int getResult() {
        return result;
    }

    public void addToResult(int value) {
        this.result += value;
    }

}
