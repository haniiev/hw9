package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(a1.readLine());
        int b = Integer.parseInt(a1.readLine());

        Rectangle r1 = new Rectangle(a,b,0);

        System.out.println(r1.getSquareRectangle());
    }
}


