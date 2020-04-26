package com.yma.designpatterns.creational.singleton;

public class SingletonWithGC {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        runtime.gc();


    }

}
