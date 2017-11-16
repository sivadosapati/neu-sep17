package class11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame {
	private JTextField first, second, result;
	private JButton plus, minus;
	private JLabel firstLabel, secondLabel, buttonLabel, resultLabel;

	public CalculatorFrame() {
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
		panel.add(plus);
		panel.add(minus);
		con.add(panel);
		con.add(resultLabel);
		con.add(result);

	}

	private void makeThisVisible() {
		this.setSize(500, 500);
		this.setVisible(true);

	}

	private void addListeners() {
		/*
		 * PlusListener p = new PlusListener(); MinusListener m = new
		 * MinusListener(); plus.addActionListener(p);
		 * minus.addActionListener(m);
		 */
		PlusMinusActionListener pm = new PlusMinusActionListener();
		plus.addActionListener(pm);
		minus.addActionListener(pm);

		MyWindowListener m = new MyWindowListener();
		this.addWindowListener(m);
	}

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

	class PlusMinusActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String f = first.getText();
			String s = second.getText();
			int i = Integer.parseInt(f);
			int j = Integer.parseInt(s);
			int r = 0;
			if (e.getSource() == plus) {
				r = i + j;
			}
			if (e.getSource() == minus) {
				r = i - j;
			}
			result.setText(r + "");

		}

	}

	class PlusListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String f = first.getText();
			String s = second.getText();
			int i = Integer.parseInt(f);
			int j = Integer.parseInt(s);
			int r = i + j;
			result.setText(r + "");

		}

	}

	class MinusListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String f = first.getText();
			String s = second.getText();
			int i = Integer.parseInt(f);
			int j = Integer.parseInt(s);
			int r = i - j;
			result.setText(r + "");

		}

	}

	private void addComponentsUsingFlowLayout() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		addComponents(con);

	}

	private void addComponents(Container con) {
		con.add(firstLabel);
		con.add(first);
		con.add(secondLabel);
		con.add(second);
		con.add(buttonLabel);
		con.add(plus);
		con.add(minus);
		con.add(resultLabel);
		con.add(result);
	}

	private void createComponents() {
		first = new JTextField(20);
		second = new JTextField(20);
		result = new JTextField(20);
		result.setEditable(false);

		plus = new JButton("+");
		minus = new JButton("-");

		Font f = new Font("Arial", Font.BOLD, 24);

		firstLabel = new JLabel("Please put in the first number..", JLabel.CENTER);
		firstLabel.setFont(f);
		secondLabel = new JLabel("Please put in the second number..", JLabel.CENTER);
		secondLabel.setFont(f);
		resultLabel = new JLabel("The Result", JLabel.CENTER);
		buttonLabel = new JLabel("Choose the operator", JLabel.CENTER);

	}

	public static void main(String[] args) {
		new CalculatorFrame();

	}

}
