package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.OnlineCourse;

public class App {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();

		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		OnlineCourse course = new OnlineCourse();

		course.setCourseName("Java Full Stack");
		course.setInstructorName("Rahul Sharma");
		course.setDuration(6);
		course.setFee(50000);

		session.persist(course);

		transaction.commit();

		System.out.println("Online Course Inserted Successfully");

		OnlineCourse result = session.get(OnlineCourse.class, course.getCourseId());

		System.out.println();
		System.out.println("Online Course Details");
		System.out.println("----------------------------");

		System.out.println("Course ID : " + result.getCourseId());
		System.out.println("Course Name : " + result.getCourseName());
		System.out.println("Instructor Name : " + result.getInstructorName());
		System.out.println("Duration : " + result.getDuration() + " Months");
		System.out.println("Fee : " + result.getFee());

		session.close();
		sessionFactory.close();
	}
}