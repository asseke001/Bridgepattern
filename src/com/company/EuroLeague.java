package com.company;

public class EuroLeague extends Football {

    protected EuroLeague(Player player) {
        super(player);
    }

    @Override
    public void playFootball() {
        System.out.println("Europe League development in progress.");
        player.scoreGoal();
    }
}
