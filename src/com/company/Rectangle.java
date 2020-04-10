package com.company;

public class Rectangle {

    private int width,height,squareRectangle;



    public Rectangle(int width, int height, int squareRectangle){
        this.width = width;
        this.height = height;
        this.squareRectangle = squareRectangle;
        if (width < 0) {
            throw new IllegalArgumentException("Меньше нуля");
        }
    }


    public int getSquareRectangle() {
            return width * height;
        }
    }

