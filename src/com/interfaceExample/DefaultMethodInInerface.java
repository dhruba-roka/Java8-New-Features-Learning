package com.interfaceExample;

interface Drawable{
    void draw();
    default void msg(){
        System.out.println("default method in interface is valid since java-8");
    }
}

public class DefaultMethodInInerface implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing picture");
    }

//    @Override
//    public void msg() {
//
//    }

    public static void main(String[] args) {
        Drawable drawable = new DefaultMethodInInerface();
        drawable.draw();
        drawable.msg();
    }
}
