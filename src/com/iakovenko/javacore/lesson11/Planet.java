package com.iakovenko.javacore.lesson11;
//Написать перечисление с планетами солнечной системы.
// Для каждой планеты необходимо задать название,
// массу и радиус.
public enum Planet {

    EARTH("Earth",6.0E24, 6400),
    MARS("Mars",6.4E23,3390 ),
    MERCURY("Mercury",3.3E23, 2440 ),
    VENUS("Venus", 4.9E24, 3025),
    JUPITER("Jupiter",1.9E27, 71300),
    SATURN("Saturn",5.68E26, 60330),
    URANUS("Uranus",8.7E25, 25600),
    NEPTUNE("Neptune",1.03E26, 24750),
    PLUTO("Pluto",1.79E22, 1500);







    private final String name;

    private final double mass;

    private  final long radius;

    Planet(String name, double mass, long radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public long getRadius() {
        return radius;
    }


}
