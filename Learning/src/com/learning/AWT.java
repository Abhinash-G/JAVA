package com.learning;
import java.applet.Applet;
import java.awt.*;

public class AWT extends Applet{
    AWT(){
        Frame f=new First();
        Button b=new Button();
        Checkbox c=new Checkbox("Check",false);
        b.setLabel("Abhinash");
        f.add(b);
        f.add(c);
        f.setSize(300,300);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AWT ob= new AWT();
    }
}
