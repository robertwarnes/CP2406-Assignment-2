package com.company;


import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame{
    Container container = null;
    public MainGUI(){
        container = this.getContentPane();
        setTitle("Mineral Supertrumps");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
