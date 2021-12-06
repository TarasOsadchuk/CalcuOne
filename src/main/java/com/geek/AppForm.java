package com.geek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppForm extends JFrame {
    public String result = "";
    //создаю кнопки
    JLabel field;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMultiplication;
    JButton buttonDivision;
    JButton buttonResult;
    JButton buttonClear;
    JButton buttonPoint;
    Data data = new Data();

    public AppForm() {
        //логика рамки
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(570, 200, 400, 410);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        //дать название каждой из них
        field = new JLabel(result);
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiplication = new JButton("*");
        buttonDivision = new JButton("/");
        buttonResult = new JButton("=");
        buttonClear = new JButton("C");
        buttonPoint = new JButton(".");
        //делаю цвет
        button1.setBackground(Color.white);
        button1.setForeground(Color.BLACK);
        button2.setBackground(Color.white);
        button2.setForeground(Color.BLACK);
        button3.setBackground(Color.white);
        button3.setForeground(Color.BLACK);
        button4.setBackground(Color.white);
        button4.setForeground(Color.BLACK);
        button5.setBackground(Color.white);
        button5.setForeground(Color.BLACK);
        button6.setBackground(Color.white);
        button6.setForeground(Color.BLACK);
        button7.setBackground(Color.white);
        button7.setForeground(Color.BLACK);
        button8.setBackground(Color.white);
        button8.setForeground(Color.BLACK);
        button9.setBackground(Color.white);
        button9.setForeground(Color.BLACK);
        button0.setBackground(Color.white);
        button0.setForeground(Color.BLACK);
        buttonPlus.setBackground(Color.LIGHT_GRAY);
        buttonPlus.setForeground(Color.BLACK);
        buttonMinus.setBackground(Color.LIGHT_GRAY);
        buttonMinus.setForeground(Color.BLACK);
        buttonMultiplication.setBackground(Color.LIGHT_GRAY);
        buttonMultiplication.setForeground(Color.BLACK);
        buttonDivision.setBackground(Color.LIGHT_GRAY);
        buttonDivision.setForeground(Color.BLACK);
        buttonResult.setBackground(Color.LIGHT_GRAY);
        buttonResult.setForeground(Color.BLACK);
        buttonClear.setBackground(Color.pink);
        buttonClear.setForeground(Color.BLACK);
        buttonPoint.setBackground(Color.LIGHT_GRAY);
        buttonPoint.setForeground(Color.BLACK);
        //координаты
        field.setBounds(20, 20, 350, 32);
        button1.setBounds(20, 70, 100, 32);
        button2.setBounds(145, 70, 100, 32);
        button3.setBounds(270, 70, 100, 32);
        button4.setBounds(20, 120, 100, 32);
        button5.setBounds(145, 120, 100, 32);
        button6.setBounds(270, 120, 100, 32);
        button7.setBounds(20, 170, 100, 32);
        button8.setBounds(145, 170, 100, 32);
        button9.setBounds(270, 170, 100, 32);
        button0.setBounds(145, 220, 100, 32);
        buttonPlus.setBounds(20, 270, 100, 32);
        buttonMinus.setBounds(20, 320, 100, 32);
        buttonMultiplication.setBounds(270, 270, 100, 32);
        buttonDivision.setBounds(270, 320, 100, 32);
        buttonResult.setBounds(145, 270, 100, 82);
        buttonClear.setBounds(270, 220, 100, 32);
        buttonPoint.setBounds(20,220,100,32);
        //додаю
        add(field);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button0);
        add(buttonPlus);
        add(buttonMinus);
        add(buttonMultiplication);
        add(buttonDivision);
        add(buttonResult);
        add(buttonClear);
        add(buttonPoint);
        //додаю логику нажатия
        button1.addActionListener(data);
        button2.addActionListener(data);
        button3.addActionListener(data);
        button4.addActionListener(data);
        button5.addActionListener(data);
        button6.addActionListener(data);
        button7.addActionListener(data);
        button8.addActionListener(data);
        button9.addActionListener(data);
        button0.addActionListener(data);
        buttonPlus.addActionListener(data);
        buttonMinus.addActionListener(data);
        buttonMultiplication.addActionListener(data);
        buttonDivision.addActionListener(data);
        buttonResult.addActionListener(data);
        buttonClear.addActionListener(data);
        buttonPoint.addActionListener(data);
    }

    private class Data implements ActionListener {
        String data;
        String asd;
        char selectedAction;
        Double res;

        public void actionPerformed(ActionEvent event) {
            Object src = event.getSource();
            //прописью логику каждого нажатия
            if (src instanceof JButton && src != buttonPlus
                    && src != buttonMinus && src != buttonMultiplication
                    && src != buttonDivision && src != buttonResult && src != buttonClear) {
                data = ((JButton) src).getText();
                field.setText(field.getText() + data);
            } else if (src == buttonPlus) {
                asd = field.getText();
                field.setText("");
                selectedAction = '+';
            } else if (src == buttonMinus) {
                asd = field.getText();
                field.setText("");
                selectedAction = '-';
            } else if (src == buttonMultiplication) {
                asd = field.getText();
                field.setText("");
                selectedAction = '*';
            } else if (src == buttonDivision) {
                asd = field.getText();
                field.setText("");
                selectedAction = '/';
            } else if (src == buttonClear) {
                field.setText("");
            } else if (src == buttonResult) {
                Double x = Double.parseDouble(asd);
                Double y = Double.parseDouble(field.getText());
                switch (selectedAction) {
                    case '+' -> {
                        res = x + y;
                        field.setText(res.toString());
                    }
                    case '-' -> {
                        res = x - y;
                        field.setText(res.toString());
                    }
                    case '*' -> {
                        res = x * y;
                        field.setText(res.toString());
                    }
                    case '/' -> {
                        res = x / y;
                        field.setText(res.toString());
                    }
                }
                //спасибо за обучение
            }
        }
    }
}
