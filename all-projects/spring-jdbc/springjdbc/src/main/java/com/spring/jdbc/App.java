package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*spring JDBC => JdbcTemplate*/
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/cofig.xml");
    	
    	/*used with configuration without xml
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		*/
    	
    	//insert 
//    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//    	
//    	Student student = new Student();
//    	student.setStudentId(106);
//    	student.setStudentName("alex");
//    	student.setStudentCity("mumbai");
//    	
//    	int result = studentDao.insert(student);
//    	
//    	System.out.println("rows affected" + result);
//    	
    	
    	/*update query*/
    	/*StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	
    	Student student = new Student();
    	student.setStudentId(101);
    	student.setStudentName("Kunal Kushwaha");
    	student.setStudentCity("Delhi");
    	
    	int result = studentDao.updateDetails(student);
    	
    	System.out.println(result);
    	*/
    	
    	/*Delete Query*/
    	/*StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	
    	int r = studentDao.deleteDetails(102);
    	System.out.println("rows deleted"+r);
    	*/
    	
    	
    	/*Select single data*/
    	/*StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	
    	Student student = studentDao.getStudent(101);
    	System.out.println(student);
    	*/
    	
    	/*selecting multiple objects*/
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	
    	List<Student> studentList =  studentDao.gettAllStudents();
    	for(Student list : studentList) {
    		System.out.println(list);
    	}
    }
}
