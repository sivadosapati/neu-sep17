package class10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class StudentManagerWithObjectPersistence extends StudentManagerAlternateImplementation {
	public StudentManagerWithObjectPersistence(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(getFileName()));
		oos.writeObject(getStudents());
		oos.close();
	}

	protected Map<String, Student> makeStudentsMap(String file) throws IOException {
		Map<String, Student> map = new HashMap<String, Student>();
		if (new File(getFileName()).exists() == false)
			return map;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(getFileName()));

		try {
			Object object = ois.readObject();
			map = (Map<String, Student>) object;
		} catch (Exception e) {
			e.printStackTrace();
		}
		ois.close();
		return map;
	}

}
