import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String personHeight = JOptionPane.showInputDialog("Enter your height in inches");
	 int personHeightValue = Integer.parseInt(personHeight);
	if(personHeightValue > 48 ) {
		JOptionPane.showMessageDialog(null, "You can go on the ride.");
	}
	else {
		JOptionPane.showMessageDialog(null, "You must grow before you can go on the ride.");
	}
}
}
