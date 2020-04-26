package com.yma.designpatterns.creational.singleton;

public class SingletonEagerDBConnection {

    private static SingletonEagerDBConnection singletonEagerDBConnection = new SingletonEagerDBConnection();

    private SingletonEagerDBConnection(){ }

    public static SingletonEagerDBConnection getSingletonEagerDBConnection(){
        return singletonEagerDBConnection;
    }

}
