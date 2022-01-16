package com.francis.fmflib;

public class FmfLib {

    private static FmfLib mInstance;

    private FmfLib(){}

    public static FmfLib getInstance(){
        synchronized (FmfLib.class){
            if (mInstance == null) {
                synchronized (FmfLib.class){
                    mInstance = new FmfLib();
                }
            }
            return mInstance;
        }
    }
    
    public String sayHello(){
        return "hello world";
    }

}
