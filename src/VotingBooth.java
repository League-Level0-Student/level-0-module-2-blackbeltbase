
	import javax.swing.JOptionPane;

	public class VotingBooth {
	public static void main(String[] args) {
		String personAge = JOptionPane.showInputDialog("Enter your age in years");
		int personAgeValue = Integer.parseInt(personAge);
		if(personAgeValue > 18 ) {
			JOptionPane.showMessageDialog(null, "who should the next president be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "nobody cares what you think");
		}
	}
	}
