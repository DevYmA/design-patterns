package com.yma.designpatterns.creational.singleton;

public class SingletonWithReal {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);
        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println(anotherRuntime);

        if(runtime == anotherRuntime){
            System.out.println("Both instances are same location");
        }

    }
}
