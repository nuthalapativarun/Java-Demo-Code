package com.example.myPackage;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSaterllite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON){
            return super.addSaterllite(moon);
        }else{
            return false;
        }
    }
}
