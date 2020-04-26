package com.yma.designpatterns.creational.singleton;

public class SingletonLazyDBConnection {

    private static SingletonLazyDBConnection singletonLazyDBConnection = null;

    private SingletonLazyDBConnection(){}

    public static SingletonLazyDBConnection getSingletonLazyDBConnecrtion(){

        if(singletonLazyDBConnection == null){
            singletonLazyDBConnection = new SingletonLazyDBConnection();
        }
        return singletonLazyDBConnection;
    }

}
