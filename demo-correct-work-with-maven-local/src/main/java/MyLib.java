package com.home.gradle.gradleprojectstructure;

import org.example.demo.gradle.local.MyLocalLib;

public class MyLib {
    public static void main (String ... arg){
        MyLocalLib lib = new MyLocalLib();
        lib.hello();

    }
}
