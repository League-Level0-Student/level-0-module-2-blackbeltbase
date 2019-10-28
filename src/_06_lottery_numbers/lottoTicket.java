package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottoTicket {
public static void main(String[] args) {
 Random lottoNumMaker = new Random();

 JOptionPane.showMessageDialog(null, "Your lotto numbers are: ");
 for(int i = 0; i<= 5; i++) {
int lottoNum = lottoNumMaker.nextInt(100); 
JOptionPane.showMessageDialog(null, lottoNum+" ");
 }
 JOptionPane.showMessageDialog(null, "The winning numbers are: ");
 for(int i = 0; i<= 5; i++) {
int lottoNum = lottoNumMaker.nextInt(100); 
JOptionPane.showMessageDialog(null, lottoNum+" ");
 }
}
}
