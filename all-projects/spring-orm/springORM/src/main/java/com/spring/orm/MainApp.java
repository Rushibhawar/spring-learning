package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Student student = new Student();
		int studentId;
		String studentName,studentCity;
		boolean checkLoop = true;
		
		while(checkLoop) {
		
			System.out.println("PRESS 1 TO ADD NEW STUDNET");
			System.out.println("PRESS 2 TO DISPLAY STUDNETS");
			System.out.println("PRESS 3 TO GET DETAIL OF ONE STUDNET");
			System.out.println("PRESS 4 TO DELETE STUDNET");
			System.out.println("PRESS 5 TO UPDATE STUDNET");
			System.out.println("PRESS 6 TO EXIT");
			
			try {
				
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					// Add new Student
					System.out.println("Enter Student ID");
					studentId = Integer.parseInt(br.readLine());
					
					System.out.println("Enter Student Name");
					studentName = br.readLine();
					
					System.out.println("Enter Student City");
					studentCity = br.readLine();
					
					student.setStudentId(studentId);
					student.setStudentName(studentName);
					student.setStudentCity(studentCity);
					
					int res = studentDao.insert(student);
					
					System.out.println("Student details inserted " + res + "\n\n");
					break;
				case 2:
					//Display Students
					List<Student> students = studentDao.getAllStudents();
					for(Student s : students) {
						System.out.println("Student ID : " + s.getStudentId());
						System.out.println("Student Name : " + s.getStudentName());
						System.out.println("Student City : " + s.getStudentCity());
						System.out.println();
					}
					System.out.println("---------------------------------------------------");

					break;
				case 3:
					//Details of one student
					System.out.println("Enter Student ID ");
					studentId = Integer.parseInt(br.readLine());
					student = studentDao.getStudent(studentId);
					System.out.println("---------------------------------------------------");
					System.out.println("Student ID : " + student.getStudentId());
					System.out.println("Student Name : " + student.getStudentName());
					System.out.println("Student City : " + student.getStudentCity());
					System.out.println("---------------------------------------------------");
					System.out.println();
					
					break;
				case 4:
					//Delete Student
					System.out.println("Enter Id Of Student To Delete");
					studentId = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(studentId);
					
					System.out.println("Student Details Are Deleted");
					System.out.println("---------------------------------------------------");
					System.out.println();
					
					break;
				case 5:
					//Update Student
					System.out.println("Enter Student Id whose details you want to update");
					studentId = Integer.parseInt(br.readLine());
					System.out.println("Enter the name to to be updated");
					studentName = br.readLine();
					System.out.println("Enter city to be updated ");
					studentCity = br.readLine();
					
					System.out.println("---------------------------------------------------");
					System.out.println();
					
					studentDao.updateStudent(studentId, studentName, studentCity);
					System.out.println("Student details have been updated");
					
					System.out.println("---------------------------------------------------");
					System.out.println();
					
					break;
				case 6:
					checkLoop = false;
					break;

				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("SOMETHING WENT WRONG INSIDE MAINAPP");
			}
		}
		System.out.println("EXITED");
		
	}

}
