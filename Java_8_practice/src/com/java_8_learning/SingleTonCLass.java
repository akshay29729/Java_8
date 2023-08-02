package com.java_8_learning;

public class SingleTonCLass implements  Cloneable{
    private  static SingleTonCLass singleTonCLass = null;

    private SingleTonCLass(){

    }

    public static SingleTonCLass getInstance(){
        if (singleTonCLass==null){
            singleTonCLass = new SingleTonCLass();
        }
        return singleTonCLass;
    }

    // Normal clone
//    public Object clone() throws CloneNotSupportedException {
//        return  super.clone();
//    }


    // avoid breaking with cloning

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning is not supported as it is Singleton class");
    }

    // to avoid breaking with serialization
    protected Object readResolve(){  // public or protected....
        return singleTonCLass;
    }
}
