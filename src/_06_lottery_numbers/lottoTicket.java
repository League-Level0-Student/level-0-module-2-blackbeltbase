package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottoTicket {
public static void main(String[] args) {
 Random lottoNumMaker = new Random();
 int lottoNum = lottoNumMaker.nextInt(100);
 JOptionPane.showMessageDialog(null, "Your lotto numbers are: "+lottoNum + " "+lottoNum + " "+lottoNum + " "+lottoNum + " "+lottoNum + " " );
 JOptionPane.showMessageDialog(null, "The winning numbers are: "+lottoNum+" "+lottoNum + " "+lottoNum + " "+lottoNum + " "+lottoNum + " ");
}
}
