package cn.enilu.guns.service;

public class MainClass  {
    public static void main(String[] args) {

        threadDemo t1=new threadDemo("A");
        threadDemo t2=new threadDemo("B");
        threadDemo t4=new threadDemo("C");
        threadDemo t5=new threadDemo("D");
        t1.start();
        t2.start();
        t4.start();
        t5.start();

    }
}
