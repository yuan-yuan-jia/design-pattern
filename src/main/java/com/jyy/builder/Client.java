package com.jyy.builder;

import javax.swing.*;
import java.awt.*;

public class Client extends JFrame {

    public Client() {
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        PersonBuilder gThin = new PersonThinBuilder(g);
        PersonDirector personDirector = new PersonDirector(gThin);
        personDirector.createPerson();


        //PersonBuilder gFat = new PersonFatBuilder(g);
        //PersonDirector pdFat = new PersonDirector(gFat);
        //pdFat.createPerson();

    }

    public static void main(String[] args) {
        new Client().setVisible(true);
    }

}
