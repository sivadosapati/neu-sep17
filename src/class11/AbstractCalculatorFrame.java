package class11;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class AbstractCalculatorFrame extends JFrame {
	private JTextField first, second, result;
	private JLabel firstLabel, secondLabel, buttonLabel, resultLabel;

	public AbstractCalculatorFrame() {
		createComponents();
		// addComponentsUsingFlowLayout();
		addComponentsUsingGridLayout();
		addListeners();
		makeThisVisible();
	}

	private void addComponentsUsingGridLayout() {
		Container con = getContentPane();
		GridLayout gl = new GridLayout(8, 1, 5, 5);
		con.setLayout(gl);
		con.add(firstLabel);
		con.add(first);
		con.add(secondLabel);
		con.add(second);
		con.add(buttonLabel);
		JPanel panel = new JPanel();
		addOperatorToPanel(panel);
		con.add(panel);
		con.add(resultLabel);
		con.add(result);

	}

	protected abstract void addOperatorToPanel(JPanel panel);

	private void makeThisVisible() {
		this.setSize(500, 500);
		this.setVisible(true);

	}

	public void addListeners() {
		addOperatorListeners();
		MyWindowListener m = new MyWindowListener();
		this.addWindowListener(m);
	}

	protected abstract void addOperatorListeners();

	class MyWindowListener implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Closed window..");
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {

		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public void calculatAndUpdateResult(String operator) {
		String f = first.getText();
		String s = second.getText();
		int i = Integer.parseInt(f);
		int j = Integer.parseInt(s);
		int r = 0;
		if (operator.equals("+")) {
			r = i + j;
		}
		if (operator.equals("-")) {
			r = i - j;
		}
		if (operator.equals("x")) {
			r = i * j;
		}
		if (operator.equals("/")) {
			r = i / j;
		}

		result.setText(r + "");

	}

	private void createComponents() {
		first = new JTextField(20);
		second = new JTextField(20);
		result = new JTextField(20);
		result.setEditable(false);

		createOperatorComponents();

		Font f = new Font("Arial", Font.BOLD, 24);

		firstLabel = new JLabel("Please put in the first number..", JLabel.CENTER);
		firstLabel.setFont(f);
		secondLabel = new JLabel("Please put in the second number..", JLabel.CENTER);
		secondLabel.setFont(f);
		resultLabel = new JLabel("The Result", JLabel.CENTER);
		buttonLabel = new JLabel("Choose the operator", JLabel.CENTER);

	}

	protected abstract void createOperatorComponents();
}
