package coreJava;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
class Student implements Comparable<Student>{
	int id;
	int marks;
	public Student(int id, int marks) {
	
		this.id = id;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		if(this.marks>s.marks)
			return -1;
		return 1;
		
	}
	
	
}
public class Marks1 {
	public static void main(String[] args) {
		List <Student> l1 = new ArrayList<>();
		l1.add(new Student(1, 55));
		l1.add(new Student(2, 94));
		l1.add(new Student(3, 76));
		l1.add(new Student(4, 46));
		l1.add(new Student(5, 63));
		Collections.sort(l1); 
		for(Student s :l1)
		{
			System.out.println(s.toString());
		}
		}
}
