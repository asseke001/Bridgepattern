package com.company;

public class ChempLeague extends Football {

    protected ChempLeague(Player player) {
        super(player);
    }

    @Override
    public void playFootball() {
        System.out.println("Champions League development in progress.");
        player.scoreGoal();
    }
}
