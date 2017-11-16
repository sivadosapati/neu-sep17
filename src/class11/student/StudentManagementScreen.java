package class11.student;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

class Student {
	String roll;
	String name;
}

public class StudentManagementScreen extends JFrame {
	private JTable studentTable;
	private TableModel tableModel;

	class StudentTableModel implements TableModel {

		private List<Student> students;

		StudentTableModel(List<Student> students) {
			this.students = students;
		}

		@Override
		public int getRowCount() {
			return students.size();
		}

		@Override
		public int getColumnCount() {
			return 2;
		}

		@Override
		public String getColumnName(int columnIndex) {
			if (columnIndex == 0) {
				return "Student Roll";
			}
			return "Student Name";
		}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			return String.class;
		}

		@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return false;
		}

		@Override
		public Object getValueAt(int rowIndex, int colIndex) {

			Student s = students.get(rowIndex);
			if (colIndex == 0) {
				return s.roll;
			} else {
				return s.name;
			}

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

	public StudentManagementScreen() {
		// behaviors = new
		// StudentManagerAlternateImplementation("students.txt");
		ArrayList<Student> students = new ArrayList<Student>();
		Student s = new Student();
		s.name = "Cva";
		s.roll = "100";
		students.add(s);
		s = new Student();
		s.name = "Ann";
		s.roll = "101";
		students.add(s);
		tableModel = new StudentTableModel(students);
		studentTable = new JTable(tableModel);

		setTitle("Student Management Screen..");

		Container con = getContentPane();
		JScrollPane jsp = new JScrollPane(studentTable);
		con.add(jsp);
		setSize(500, 500);
		show();

	}

	public static void main(String[] args) {
		new StudentManagementScreen();

	}

}
