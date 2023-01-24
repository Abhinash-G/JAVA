package com.learning;

import java.awt.*;

class First extends Frame implements Runnable{
    First(){

    }
    First(int i){

        Button b=new Button("click me");

        b.setBounds(30,100,80,30);// setting button position

        add(b);//adding button into frame

        setSize(300,300);//frame size 300 width and 300 height

        setLayout(null);//no layout manager

        setVisible(true);//now frame will be visible, by default not visible
    }
    void First2(){

        Frame f=new Frame();

        Button b=new Button("click me");

        b.setBounds(30,50,80,30);

        f.add(b);

        f.setSize(300,300);

        f.setLayout(null);

        f.setVisible(true);

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                new First(0);
                Thread.sleep(4000);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            try {
                First2();
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return;
    }

    public static void main(String args[]){
        First ob=new First();
        Thread t=new Thread(ob);
        t.start();
    }
}
