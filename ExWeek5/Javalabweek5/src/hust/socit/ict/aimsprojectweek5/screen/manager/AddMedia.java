package ict.aimsprojectweek5.screen.manager;

import ict.aimsprojectweek5.store.*;

import java.awt.*;
import javax.swing.*;

public abstract class AddMedia extends JFrame {
    protected Store store;
    protected JFrame frame;

    public AddMedia(Store store) {
    }

    public void addMedia(Store store) {
        this.store = store;
        frame = new JFrame();
        frame.setTitle("Add Item to Store");
        frame.setSize(400 , 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }

    public void display() {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    protected abstract void addItemToStore();
    public static void main(String[] args) {
        System.out.print("addmedia");
    }
}