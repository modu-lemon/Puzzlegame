package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
