package com.company;

public class GraphArch {
    private int number;
    private int length;
    private GraphPoint start;
    private GraphPoint end;

    public GraphArch(int number, int length, GraphPoint start, GraphPoint end) {
        this.number = number;
        this.length = length;
        this.start = start;
        this.end = end;
    }

    public GraphArch() {
        this.number = 0;
        this.length = 1;
        this.start = new GraphPoint();
        this.end = new GraphPoint();
    }

    public int getLength() {
        return length;
    }

    public int getNumber() {
        return number;
    }

    public GraphPoint getStart() {
        return start;
    }

    public GraphPoint getEnd() {
        return end;
    }

    public GraphPoint goInStraightOrder() {
        return end;
    }

    public GraphPoint goInReverseOrder() {
        return start;
    }

}



