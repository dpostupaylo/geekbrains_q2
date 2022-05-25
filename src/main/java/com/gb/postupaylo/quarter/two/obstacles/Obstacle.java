package com.gb.postupaylo.quarter.two.obstacles;

import com.gb.postupaylo.quarter.two.participants.Participant;

public interface Obstacle {
    boolean overcome(Participant participant);
    String getName();
}
