package june29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Poll {

	static enum Sex{
		MALE, FEMALE;
	}
	
	static enum Job{
		WORK,NOTWORK;
		
	}
	
	static class Student{
		private int photoId;
		private Sex sex;
		private Job job;
		private int salary;
		
		
		public Student(int photoId, Sex sex, Job job, int salary) {
		
			this.photoId = photoId;
			this.sex = sex;
			this.job = job;
			this.salary = salary;
		}
		public Sex getSex() {
			return sex;
		}
		public void setSex(Sex sex) {
			this.sex = sex;
		}
		public Job getJob() {
			return job;
		}
		public void setJob(Job job) {
			this.job = job;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		

		
		
	}
	
	
	static int getMenNum(List<Student> list){
		int menNum= 0;
		for (int i = 0 ; i < list.size() ; i++){
			if (list.get(i).getSex() == Sex.MALE)menNum++;			
		}
		System.out.println("menNum:" + menNum);
		return menNum;
	}
	
	static int getFemaleNum(List<Student> list){
		int femaleNum= 0;
		for (int i = 0 ; i < list.size() ; i++){
			if (list.get(i).getSex() == Sex.FEMALE)femaleNum++;			
		} 
		System.out.println("femaleNum:" + femaleNum );
		return femaleNum;
	}
	
	static int getWorkMenNum(List<Student> list){
		int workMenNum= 0;
		for (int i = 0 ; i < list.size() ; i++){
			if ((list.get(i).getSex() == Sex.MALE)&&(list.get(i).getJob() == Job.WORK))workMenNum++;			
		}
		System.out.println("workMenNum: " + workMenNum);
		return workMenNum;
	}
	static int getWorkFemaleNum(List<Student> list){
		int workFemaleNum= 0;
		for (int i = 0 ; i < list.size() ; i++){
			if ((list.get(i).getSex() == Sex.FEMALE)&&(list.get(i).getJob() == Job.WORK))workFemaleNum++;			
		}
		System.out.println("workFemaleNum: " + workFemaleNum);
		return workFemaleNum;
	}
	
	static double getPercentage(int var1, int var2){
		double percentage = 0;
		if (var2 != 0 ) percentage = Math.round(var1/var2*100)/100;
		
		return percentage;
	}
	
	
	// Create method for man's summary salary
	static double getManSumSal(List<Student> list){
		double manSumSal = 0;
		for (int i = 0 ; i < list.size() ; i++){
			if ((list.get(i).getSex() == Sex.MALE)&&(list.get(i).getJob() == Job.WORK))manSumSal = manSumSal + list.get(i).getSalary();			
				
		}
		return manSumSal;
	}
	
	
	// Create method for female's summary salary
	static double getFemaleSumSal(List<Student> list){
		double femaleSumSal = 0;
		for (int i = 0 ; i < list.size() ; i++){
			if ((list.get(i).getSex() == Sex.FEMALE)&&(list.get(i).getJob() == Job.WORK))femaleSumSal = femaleSumSal + list.get(i).getSalary();			
		}
		return femaleSumSal;
	}
	
	//Create Method for creating average
	static double getAverage(double sum, int quantity){
		double average = 0;
		if (quantity != 0){
			average = sum/quantity;
		}
		
		
		return average;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		List<Student> list = new ArrayList<>();
		for (int i = 0 ; i < 3 ; i++){
			 int photoId;
			 Sex sex;
			 Job job;
			 int salary;
			Scanner scanner = new Scanner(System.in);
			System.out.println("No." + (i+1));
			System.out.println("Please input Photo ID#(It's an integer):");
			photoId = scanner.nextInt();
			System.out.println("Please input Sex(1 - Male 2 - Female):");
			if (scanner.nextInt() == 1)sex = Sex.MALE;
			else sex = Sex.FEMALE;
			System.out.println("Please input Job (1 - If you work 2 - Do not work):");
			if (scanner.nextInt() == 1)job = Job.WORK;
			else job = Job.NOTWORK;
			System.out.println("Please input Salary (An integer value) :");
			salary = scanner.nextInt();
			list.add(new Student(photoId, sex, job, salary));			
			
		}
		
		System.out.println("Percentage of men in the university: " + (getMenNum(list)/list.size())*100);
		System.out.println("Percentage of women in the university: " + (getFemaleNum(list)/list.size()*100));
		System.out.println("Percentage of men who work: " + (getPercentage(getWorkMenNum(list), getMenNum(list))));
		System.out.println("Average salary of man: " + (getManSumSal(list)/getWorkMenNum(list)));
		
		System.out.println("Percentage of working women: " + (getPercentage(getWorkFemaleNum(list), getFemaleNum(list))));
		System.out.println("Average salary of women: " + (getAverage(getFemaleSumSal(list), getWorkFemaleNum(list))));
		
		
		
		
		
		

	}



	

}
