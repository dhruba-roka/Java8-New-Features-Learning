package com.interfaceExample;

//STATIC METHOD IS VALID SINCE JAVA-8 VERSION ON INTERFACE:

interface Drawable1{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}

public class StaticMethodInInterface implements Drawable1{
    @Override
    public void draw() {
        System.out.println("drawing method ");
    }

    public static void main(String[] args) {
        Drawable1 drawable1 = new StaticMethodInInterface();
        drawable1.draw();
        int cube = Drawable1.cube(5);
        System.out.println(cube);
    }
}
