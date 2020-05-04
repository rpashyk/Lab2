package com.company;

class Class1{
    Class1(){
        new Class2();
    }
}
class Class2 extends Class1{
    Class2(){
        new Class1();
    }
}
public class Main {

    public static void main(String[] args) {
	   Class1 classs = new Class1();
    }
}
