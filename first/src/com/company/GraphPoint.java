package com.company;

public class GraphPoint {
    private int number_of_point;
    private int power;
    private int arcs_in;
    private int arcs_out;
    public static int increment = 0;

    public GraphPoint(int number_of_point, int power, int arcs_in, int arcs_out)
    {
        this.number_of_point = number_of_point;
        this.power = power;
        this.arcs_in = arcs_in;
        this.arcs_out = arcs_out;
    }

    public GraphPoint(int number_of_point, int power) {
        this.number_of_point = number_of_point;
        this.power = power;
        this.arcs_in = 0;
        this.arcs_out = 0;
    }

    public GraphPoint() {
        this.arcs_out = 0;
        this.arcs_out = 0;
        this.number_of_point = increment++;
        this.power = 0;

    }

    public int getNumber_of_point() {
        return number_of_point;
    }

    public int getPower() {
        return power;
    }

    public int getArcs_in() {
        return arcs_in;
    }

    public int getArcs_out() {
        return arcs_out;
    }

    public void setNumber_of_point(int number_of_point) {
        this.number_of_point = number_of_point;
    }

    public void new_arc(boolean in) {

        if (in) {
            this.arcs_in++;
        }
        else {
            this.arcs_out++;
        }
        power++;
    }


    public void new_edge() {
        power++;
    }

    public boolean isIsolated() {
        return power == 0;
    }

    public boolean isLeaf() {
        return power == 1;
    }

    public boolean isSource() {
        return arcs_out > 0 && arcs_in == 0;
    }

    public boolean isSink() {
        return arcs_out > 0 && arcs_in == 0;
    }
}

