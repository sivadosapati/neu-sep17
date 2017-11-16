package class11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(1400, 1600);
		frame.setLocation(100, 100);
		frame.setTitle("My First Frame");

		JButton button = new JButton("Click Me..");
		Container pane = frame.getContentPane();
		// Container pane = frame;

		pane.setLayout(new FlowLayout());

		JButton button1 = new JButton("Click Me Also..");

		class ChangeBackground implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color c = pane.getBackground();
				if (c == Color.BLUE) {
					pane.setBackground(Color.RED);
				} else {
					pane.setBackground(Color.BLUE);
				}
				// frame.pack();
				System.out.println("Button click");

			}

		}

		class Counter implements ActionListener {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				button.setLabel("Clicked - > " + count);

			}

		}

		ChangeBackground cb = new ChangeBackground();
		button.addActionListener(cb);
		Counter c = new Counter();
		button.addActionListener(c);
		pane.add(button);
		pane.add(button1);
		frame.setVisible(true);

	}
}
