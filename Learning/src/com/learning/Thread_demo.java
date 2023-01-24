package com.learning;
import java.util.*;
public class Thread_demo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 26; i += 2) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}