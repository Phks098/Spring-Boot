package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		/*
		 * Exam exam = new NewlecExam(); Exam exam = new NewlecExam(10,10,10,10);
		 * ExamConsole console = new GridExamConsole(exam); console.print();
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml"); // ExamConsole
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		System.out.println(console.toString());
		// Exam exam = context.getBean(Exam.class);
		

		// List<Exam> exams = (List<Exam>) context.getBean("exams");

		/*
		 * for(Exam e : exams) { System.out.println(e); }
		 */
	}
}
