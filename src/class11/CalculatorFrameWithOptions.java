package class11;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import com.sun.javafx.css.CalculatedValue;

public class CalculatorFrameWithOptions extends AbstractCalculatorFrame {
	private JComboBox options;

	public static void main(String[] args) {
		new CalculatorFrameWithOptions();

	}

	@Override
	protected void addOperatorToPanel(JPanel panel) {
		panel.add(options);

	}

	@Override
	protected void addOperatorListeners() {
		OptionListener o = new OptionListener();
		options.addItemListener(o);

	}

	class OptionListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			Object o = options.getSelectedItem();
			System.out.println(o.toString());
			calculatAndUpdateResult(o.toString());

		}

	}

	@Override
	protected void createOperatorComponents() {
		String[] o = new String[] { "+", "-", "x", "/" };
		options = new JComboBox(o);

	}

}
