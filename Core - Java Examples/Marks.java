package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	int id;
	int marks;
	public Students(int id, int marks) {

		this.id = id;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", marks=" + marks + "]";
	}

}
class Comp implements Comparator<Students>{

	public int compare(Students o1, Students o2) {
		if (o1.marks > o2.marks) {
			return -1;
		}else {
			return 1;
		}}

}
public class Marks {
	public static void main(String[] args) {
		List <Students> l1 = new ArrayList<>();
		Comparator<Students> cm = new Comp();
		l1.add(new Students(1, 55));
		l1.add(new Students(2, 94));
		l1.add(new Students(3, 76));
		l1.add(new Students(4, 46));
		l1.add(new Students(5, 63));
		Collections.sort(l1,cm); 
		for(Students s :l1)
		{
			System.out.println(s.toString());
		}
	}}






