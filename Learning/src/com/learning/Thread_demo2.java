package com.learning;

public class Thread_demo2 implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 26; i += 2) {
                try {
                    System.out.println(i);
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    public static void main(String[] args) {
        Thread_demo ob= new Thread_demo();
        Thread_demo2 ob2=new Thread_demo2();
        Thread t=new Thread(ob2);
        ob.start();
        t.start();
    }
}
