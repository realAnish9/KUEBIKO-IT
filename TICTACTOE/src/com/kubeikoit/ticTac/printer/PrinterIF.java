package com.kubeikoit.ticTac.printer;

public interface PrinterIF {

    //Overloading
    //same method name but different params (signature)
    public void print(String message);
    public void print(String [][] array);
}
