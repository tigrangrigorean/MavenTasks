package com.tasks.jaxb_gson.jaxb;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;


public class XMLTask {
	
	public XMLTask() {
		
	}
	
	/**
	 * Method validate XML
	 * @return
	 */
	public boolean validateXMLByJavax() {
		
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		
		try {
			Schema schema = factory.newSchema(new File("src/main/resources/students.xsd"));
			Validator validator = schema.newValidator();
			Source source = new StreamSource(new File("src/main/resources/students.xml"));
			validator.validate(source);
			return true;
		} catch (SAXException e) {
			e.printStackTrace();
		} catch(IOException c) {
			c.printStackTrace();
		}
		
		return false;
		
	}
	
	/**
	 * Method validates XML by JaxB
	 * @return
	 */
	
	public boolean validateXMLByJaxB()  {
		
	        try {
	        	
	        	JAXBContext context = JAXBContext.newInstance(Student.class);

	  	        Unmarshaller unmarshaller = context.createUnmarshaller();

	  	        SchemaFactory schemaFactory = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
	  	        Schema schema = schemaFactory.newSchema(new File("src/main/resources/students.xsd"));
	  	        unmarshaller.setSchema(schema);
				Student students = (Student) unmarshaller.unmarshal(new File("src/main/resources/students.xml"));
				return true;
			} catch (JAXBException e) {
				e.printStackTrace();
				System.out.println("Invalid");
			} catch (SAXException e) {
				e.printStackTrace();
				System.out.println("Invalid");
			}
	        
		return false;
	}
	
	
	/**
	 * Method unmarshal students
	 * @return
	 */
	public List<Student> unmarshalStudentList() {
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(StudentList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StudentList studentList = (StudentList) jaxbUnmarshaller.unmarshal(new File("src/main/resources/students.xml"));
			return studentList.getStudents();
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		  
		return null;
	}
	

	/**
	 * Method marshal StudentList
	 * @return
	 */
	public List<Student> marshalStudentList() {
		StudentList studentList = new StudentList();
		for(int i = 0; i<unmarshalStudentList().size(); i++) {
			Student student = new Student();
			student.setFirstName(unmarshalStudentList().get(i).getFirstName());
			student.setLastName(unmarshalStudentList().get(i).getLastName());
			student.setNickName(unmarshalStudentList().get(i).getNickName());
			student.setRollNo(unmarshalStudentList().get(i).getRollNo());
			studentList.getStudents().add(student);
		}
		
		try {
    		JAXBContext jaxbContext = JAXBContext.newInstance(StudentList.class);
    		Marshaller marshaller = jaxbContext.createMarshaller();
        	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(studentList, new File("output.xml"));
			return studentList.getStudents();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
