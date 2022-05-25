package com.gb.postupaylo.quarter.two.obstacles;

import com.gb.postupaylo.quarter.two.participants.Participant;

public class Treadmill implements Obstacle {
    private final String name = "treadmill";
    private final int distance;

    public Treadmill(int height){
        this.distance = height;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(distance);
    }
}
