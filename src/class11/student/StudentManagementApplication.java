package class11.student;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import class10.Student;
import class10.StudentManagerAlternateImplementation;
import class10.StudentManagerBehaviors;

class StudentsTableModel implements TableModel {
	private StudentManagerBehaviors smb;

	public StudentsTableModel(StudentManagerBehaviors smb) {
		this.smb = smb;
	}

	@Override
	public int getRowCount() {
		return smb.getTotalStudents();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0)
			return "Roll";
		if (columnIndex == 1)
			return "Name";
		return null;

	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ArrayList<Student> students = (ArrayList<Student>) smb.getStudents();
		Student student = students.get(rowIndex);
		if (columnIndex == 0) {
			return student.getRollNumber();
		}
		return student.getName();
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}

public class StudentManagementApplication extends JFrame {
	private JTable table;
	private StudentsTableModel tableModel;
	private JButton add, delete, find, saveAndClose;
	private JLabel nameLabel, rollLabel;
	private JTextField nameText, rollText;
	private StudentManagerBehaviors smb;

	public StudentManagementApplication(StudentManagerBehaviors smb) {
		this.smb = smb;
		create();
		addComponents();
		makeListeners();
		display();
		setTitle("Student Management Application..");
	}

	public void create() {
		tableModel = new StudentsTableModel(smb);
		table = new JTable(tableModel);
		add = new JButton("Add");
		delete = new JButton("Delete");
		find = new JButton("Find");
		saveAndClose = new JButton("Save and Close..");
		nameLabel = new JLabel("Enter Name : ");
		rollLabel = new JLabel("Enter Roll : ");
		nameText = new JTextField(10);
		rollText = new JTextField(10);

	}

	public void addComponents() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		// Add Table to the north..
		con.add(makeTablePanel(), "North");
		// Add the screen to enter information in center - create a panel for
		// the input..
		con.add(makeInputPanel(), "Center");
		// Add the buttons to south - create a panel from the buttons..
		con.add(makeButtonPanel(), "South");
	}

	private JPanel makeInputPanel() {
		JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
		panel.add(rollLabel);
		panel.add(rollText);
		panel.add(nameLabel);
		panel.add(nameText);
		panel.setBorder(new TitledBorder("Student Input section.."));
		return panel;
	}

	private JPanel makeButtonPanel() {
		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(delete);
		panel.add(find);
		panel.add(saveAndClose);
		panel.setBorder(new TitledBorder("Actions section.."));
		return panel;
	}

	private JPanel makeTablePanel() {
		JPanel panel = new JPanel();
		panel.add(new JScrollPane(table));
		panel.setBorder(new TitledBorder("Students information.."));
		return panel;
	}

	public void makeListeners() {
		StudentActionListener sal = new StudentActionListener();
		add.addActionListener(sal);
		delete.addActionListener(sal);
		find.addActionListener(sal);
		saveAndClose.addActionListener(sal);
	}

	class StudentActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Student student = makeStudentFromInputSection();
			if (e.getSource() == add) {
				addStudent(student);
			}
			if (e.getSource() == delete) {
				deleteStudent(student);
			}
			if (e.getSource() == find) {
				findStudent(student);
			}
			if (e.getSource() == saveAndClose) {
				saveStudents();
				System.exit(0);
			}
			table.updateUI();
		}

	}

	private Student makeStudentFromInputSection() {
		Student s = new Student(nameText.getText(), rollText.getText());
		return s;
	}

	private void addStudent(Student student) {
		// Add Student to the Model - StudentManagerBehavior..
		System.out.println("Add Student");
		smb.saveStudent(student);
	}

	private void deleteStudent(Student student) {
		smb.deleteStudents(student.getRollNumber());
	}

	private void findStudent(Student student) {
		String roll = student.getRollNumber();
		String name = smb.findStudent(roll);
		JOptionPane.showMessageDialog(null, "Student with Roll -> " + roll + " has a name -> " + name);
	}

	private void saveStudents() {
		smb.save();
	}

	public void display() {
		setSize(700, 700);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		StudentManagerBehaviors smb = new StudentManagerAlternateImplementation("students.txt");
		new StudentManagementApplication(smb);
	}

}
