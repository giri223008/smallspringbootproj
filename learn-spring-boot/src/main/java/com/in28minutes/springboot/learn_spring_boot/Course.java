package com.in28minutes.springboot.learn_spring_boot;

public class Course {
	private long id;
	private String courseName;
	private String tutor;
	
	public Course(long id, String courseName, String tutor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.tutor = tutor;
	}

	public long getId() {
		return id;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public String getTutor() {
		return tutor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", tutor=" + tutor + "]";
	}
	
	
}
