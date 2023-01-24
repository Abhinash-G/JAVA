package com.learning;

import java.applet.Applet;

import java.awt.Graphics;

public class TestApplet extends Applet{

    public void paint(Graphics g){

        g.drawString("welcome to applet",150,150);

    }

}/*javac First.java

c:\>appletviewer First.java*/