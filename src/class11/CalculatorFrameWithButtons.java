package class11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalculatorFrameWithButtons extends AbstractCalculatorFrame {
	private JButton plus, minus;

	@Override
	protected void addOperatorToPanel(JPanel panel) {
		panel.add(plus);
		panel.add(minus);
	}

	@Override
	protected void addOperatorListeners() {
		PMListener p = new PMListener();
		plus.addActionListener(p);
		minus.addActionListener(p);

	}

	class PMListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == plus) {
				calculatAndUpdateResult("+");
			}
			if (e.getSource() == minus) {
				calculatAndUpdateResult("-");
			}

		}

	}

	@Override
	protected void createOperatorComponents() {
		plus = new JButton("+");
		minus = new JButton("-");

	}

	public static void main(String args[]) {
		new CalculatorFrameWithButtons();
	}

}
