package com.company;

public abstract class Football {
    protected Player player;

    protected Football(Player player) {
        this.player = player;
    }

    public abstract void playFootball();
}
