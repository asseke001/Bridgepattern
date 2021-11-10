package com.company;

public class Referee {
    public static void main(String[] args) {
        Football[] footballs = {
                new ChempLeague(new Winger()),
                new EuroLeague(new Goalkeeper())
        };

        for (Football football : footballs) {
            football.playFootball();
        }
    }
}
