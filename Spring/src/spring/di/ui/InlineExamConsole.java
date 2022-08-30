package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	//생성자
	public InlineExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}
	
	@Override
	public String toString() {
		return "InlineExamConsole [exam=" + exam + "]";
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f/n", exam.total(),exam.avg());
	}

}
