package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;


@Component("console")
public class GridExamConsole implements ExamConsole {
	
	@Autowired(required = false)// required
	//@Qualifier("exam1")
	private Exam exam;

	public GridExamConsole() {
		super();
		System.out.println("constructor");
	}
	
	
	
	public GridExamConsole(Exam exam) {
		
		super();
		System.out.println("overload constructor");
		this.exam = exam;
	}
	
	
	public Exam getExam() {
		return exam;
	}
	
	
	public void setExam(Exam exam) {
		System.out.println("setter  호출");
		this.exam = exam;
	}
	

	@Override
	public void print() {
		System.out.println("***************");
		System.out.println("total"+exam.total());
		System.out.println("avg"+exam.avg());
		System.out.println("*****************");
	}

}
