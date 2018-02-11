package com.company;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;


    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public String giveTriangle(int sideA, int sideB, int sideC) {
        String result = "";
        if (sideA == sideB && sideB == sideC){
            result = "====== Your triangle is a equilateral triangle ======";
        }
        else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            result = "====== Your triangle is a isosceles triangle ======";
        }
        else if (sideA != sideB && sideB != sideC) {
            result = "====== Your triangle is a scalene triangle ======";
        }
        return result;
    }
}
