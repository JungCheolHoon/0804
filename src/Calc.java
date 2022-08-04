
public class Calc {
	void calc(Student student){
		student.setTot(student.getKor() + student.getEng() + student.getMat());
		student.setAvg(student.getTot()/3.); 
		if(student.getAvg() >=90) 			student.setGrade('A');
		else if(student.getAvg()>=80) 	student.setGrade('B');
		else if(student.getAvg()>=70)	student.setGrade('C');
		else if(student.getAvg()>=60)	student.setGrade('D');
		else										student.setGrade('F');
	}
}
