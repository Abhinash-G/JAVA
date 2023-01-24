package com.learning;
import java.io.*;

public class FileDemo {
    public static void main(String[] args)throws IOException {
        byte [] b;
        try {
            File f = new File("D://JAVA.txt");
            FileInputStream fin = new FileInputStream(f);
            b = fin.readAllBytes();
            System.out.println("Read");
            fin.close();
            try{
                File f2=new File("D://Text.txt");
                FileOutputStream fout=new FileOutputStream(f2);
                fout.write(b);
                System.out.println("Written");
                fout.flush();
                fout.close();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
