package com.yma.designpatterns.creational.singleton;

public class SingletonTreadsafeDBConnection {

    private static volatile SingletonTreadsafeDBConnection instance = null;

    private SingletonTreadsafeDBConnection(){
        if(instance != null){
            throw new RuntimeException("This is a singleton class. Use getInstance ()");
        }
    }

    public static SingletonTreadsafeDBConnection getInstance() {
        if(instance == null){
            synchronized (SingletonTreadsafeDBConnection.class){
                if(instance == null){
                    instance = new SingletonTreadsafeDBConnection();
                }
            }
        }
        return instance;
    }
}
