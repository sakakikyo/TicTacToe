/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends Frame implements ActionListener {
  Button tmbl1, tmbl2, tmbl3, tmbl4, tmbl5, tmbl6, tmbl7, tmbl8, tmbl9;
  String turn;

  public TicTacToe() {
      
      super.setTitle("-Tic Tac Toe-");
      this.addWindowListener(new WindowAdapter() {
          public void tutupJendela(WindowEvent e){
              dispose();
              System.exit(0);
          }
      });
    
      this.setLayout(new GridLayout(3,3));
      this.tmbl1=new Button();
      this.tmbl1.setFont(new Font("Dialog",3,40));
      this.tmbl1.addActionListener(this);
      this.add(tmbl1);
      
         this.tmbl2=new Button();
      this.tmbl2.setFont(new Font("Dialog",3,40));
      this.tmbl2.addActionListener(this);
      this.add(tmbl2);
      this.tmbl3=new Button();
      this.tmbl3.setFont(new Font("Dialog",3,40));
      this.tmbl3.addActionListener(this);
      this.add(tmbl3);
      this.tmbl4=new Button();
      this.tmbl4.setFont(new Font("Dialog",3,40));
      this.tmbl4.addActionListener(this);
      this.add(tmbl4);
      this.tmbl5=new Button();
        
            this.tmbl5.setFont(new Font("Dialog",3,40));
      this.tmbl5.addActionListener(this);
      this.add(tmbl5);
      this.tmbl6=new Button();
      this.tmbl6.setFont(new Font("Dialog",3,40));
      this.tmbl6.addActionListener(this);
      this.add(tmbl6);
      this.tmbl7=new Button();
      this.tmbl7.setFont(new Font("Dialog",3,40));
      this.tmbl7.addActionListener(this);
      this.add(tmbl7);
      
      this.tmbl8=new Button();
      this.tmbl8.setFont(new Font("Dialog",3,40));
      this.tmbl8.addActionListener(this);
      this.add(tmbl8);
      this.tmbl9=new Button();
      this.tmbl9.setFont(new Font("Dialog",3,40));
      this.tmbl9.addActionListener(this);
      this.add(tmbl9);
    
      this.turn = "X";
    
  }

  public void actionPerformed(ActionEvent e) {
      Boolean change = false;
      if (e.getSource()==tmbl1 && tmbl1.getLabel()=="") {tmbl1.setLabel(turn);change=true;}
      else if (e.getSource()==tmbl2 && tmbl2.getLabel()=="") {tmbl2.setLabel(turn);change=true;}
      else if (e.getSource()==tmbl3 && tmbl3.getLabel()=="") {tmbl3.setLabel(turn);change=true;}
      else if (e.getSource()==tmbl4 && tmbl4.getLabel()=="") {tmbl4.setLabel(turn);change=true;}
      else if (e.getSource()==tmbl5 && tmbl5.getLabel()=="") {tmbl5.setLabel(turn);change=true;}
      else if (e.getSource()==tmbl6 && tmbl6.getLabel()=="") {tmbl6.setLabel(turn);change=true;}
      else if (e.getSource()==tmbl7 && tmbl7.getLabel()=="") {tmbl7.setLabel(turn);change=true;}
      else if (e.getSource()==tmbl8 && tmbl8.getLabel()=="") {tmbl8.setLabel(turn);change=true;}
      else if (e.getSource()==tmbl9 && tmbl9.getLabel()=="") {tmbl9.setLabel(turn);change=true;}
    
      if ((tmbl1.getLabel()==turn &&
              tmbl2.getLabel()==turn &&
              tmbl3.getLabel()==turn) ||
              (tmbl4.getLabel()==turn &&
              tmbl5.getLabel()==turn &&
              tmbl6.getLabel()==turn) ||
              (tmbl7.getLabel()==turn &&
              tmbl8.getLabel()==turn &&
              tmbl9.getLabel()==turn) ||
              (tmbl1.getLabel()==turn &&
              tmbl4.getLabel()==turn &&
              tmbl7.getLabel()==turn) ||
              (tmbl2.getLabel()==turn &&
              tmbl5.getLabel()==turn &&
              tmbl8.getLabel()==turn) ||
              (tmbl3.getLabel()==turn &&
              tmbl5.getLabel()==turn &&
              tmbl9.getLabel()==turn) ||
              (tmbl1.getLabel()==turn &&
              tmbl5.getLabel()==turn &&
              tmbl9.getLabel()==turn) ||
              (tmbl3.getLabel()==turn &&
              tmbl5.getLabel()==turn &&
              tmbl7.getLabel()==turn) ){
          this.setTitle(turn + " menang!");
          tmbl1.setEnabled(false);tmbl2.setEnabled(false);tmbl3.setEnabled(false);
          tmbl4.setEnabled(false);tmbl5.setEnabled(false);tmbl6.setEnabled(false);
          tmbl7.setEnabled(false);tmbl8.setEnabled(false);tmbl9.setEnabled(false);
      }
    
    
      if (change==true){
          if (turn=="X" && change==true) 
              turn="O"; else turn = "X";
      }
  }

  public static void main(String[] args){
    
      TicTacToe frm = new TicTacToe();
    
      frm.setSize(300, 300);
      frm.setVisible(true);
    
  }
}
