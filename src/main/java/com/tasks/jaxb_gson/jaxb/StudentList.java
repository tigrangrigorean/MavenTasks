package com.tasks.jaxb_gson.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "class")
public class StudentList {

    
    private List<Student> studentList = new ArrayList<Student>();

	/**
	 * @return the students
	 */
    @XmlElement(name = "student")
	public List<Student> getStudents() {
		return studentList;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> studentList) {
		this.studentList = studentList;
	}

    
}
