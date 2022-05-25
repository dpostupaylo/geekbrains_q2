package com.gb.postupaylo.quarter.two.obstacles;

import com.gb.postupaylo.quarter.two.participants.Participant;

public class Wall implements Obstacle {
    private final String name = "wall";
    private final int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(height);
    }
}
