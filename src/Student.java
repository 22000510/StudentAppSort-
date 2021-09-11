
public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	

	public Student(int i, String string, int j) {
		name = string;
		no = i;
		age = j;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}


	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
