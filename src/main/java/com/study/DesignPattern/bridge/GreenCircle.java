package com.study.designPattern.bridge;

/**
 * Created by guobing on 2016/4/29.
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("green circle : radius : " + radius + " x : " + x + " y : " + y);
    }
}
