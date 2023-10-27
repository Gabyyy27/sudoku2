/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ferna
 */
public class tablero extends JPanel {
    public JButton[][] botones;
    public int num;
    public tablero(){
        setLayout(new GridLayout(9, 9));
        botones = new JButton[9][9];
        setSize(550,550);
         for (int fila = 0; fila < 9; fila++) {
            for (int columna = 0; columna < 9; columna++) {
            botones [fila][columna] = new JButton();
            if(columna<=2&&fila<=2)
            botones[fila][columna].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
           else if(columna<=5&&columna>2){
               if(fila<=5&&fila>2)
               botones[fila][columna].setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));}
            botones [fila][columna].setPreferredSize(new Dimension(50, 50));
            botones [fila][columna].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    JButton sourceButton = (JButton) e.getSource();
                    if (sourceButton.getText().isEmpty())
                        sourceButton.setText(Integer.toString(num));
                    }
            });
            add(botones[fila][columna]);
                    }
            
            }
            
            }
    public void setNumber(int numero){
        num=numero;
    }
    }

