import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 =new Student(101,"Kim",23);
		al.add(s1);
		Student s2=new Student(102, "Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Lee",24));
		al.add(new Student(105,"Youn",20));
		al.add(new Student(106,"Cho",23));
		al.add(new Student(107,"Yang",22));
		al.add(new Student(108,"Sung",21));
		al.add(new Student(109,"Jin",27));
		al.add(new Student(110,"Chul",29));
		Collections.sort(al);
		for( Student s : al) {	
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse orderded by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0;i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
	}

}
