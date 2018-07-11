package june29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import june29.Poll.Job;
import june29.Poll.Sex;
import june29.Poll.Student;

public class PollVersion2 {

	// Outline:
	// There 3 main steps.
	// First, Create sex and work enum, and student class 
		// sex and work, both have only two options there is no need to use enum, they can be replaced by boolean
	// Then read student information from input and store them into list
	// Last use stream to filter the list to obtain data.
	
	
	
	

	
	
	
	
	public static void main(String[] args) {
			
		// Create list for storing students
		List<Student> list = new ArrayList<>();
		
		// Input students
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
		
		//Percentage of men in the university
		//Create variable of male number
		double perMenUni = list.stream()
							   .filter(a -> a.sex == Sex.MALE)
							   .count()/list.size();
		System.out.println("Percentage of men in the university: " + perMenUni);
		
		//Percentage of women in the university
		double perFemaleUni = list.stream()
								  .filter(a -> a.sex == Sex.FEMALE)
								  .count()/list.size();
		System.out.println("Percentage of Women in the university: " + perFemaleUni);
			
		
		//Percentage of men who work and average salary
		// Men work number
		long menWorkNum = list.stream()
								.filter(a -> a.getSex() == Sex.MALE)
								.filter(a -> a.getJob() == Job.WORK)
								.count();
	
		
		//Percentage of men work number
		double perMenWork = menWorkNum/list.size();
		System.out.println("Percentage of men who work: " + perMenWork);
		
		double menAveSal = list.stream()
							   .filter(a -> a.getSex() == Sex.MALE)
							   .filter(a -> a.getJob() == Job.WORK)
							   .mapToDouble(a -> a.salary)
							   .average()
							   .orElse(0);
		System.out.println("Average salary:" + menAveSal);
				
				
		
		//Percentage of working women and average salary
		//Working women number
		long workWomenNum = list.stream()
								.filter(a -> a.getSex() == Sex.FEMALE)
								.filter(a -> a.getJob() == Job.WORK)
								.count();
								
		double perFemaleWork = workWomenNum/list.size();
		System.out.println("Percentage of working women: " + perFemaleWork);
		
		double femaleAveSal = list.stream()
								  .filter(a -> a.getSex() == Sex.FEMALE)
								  .filter(a -> a.getJob() == Job.WORK)
								  .mapToDouble(a -> a.salary)
								  .average()
								  .orElse(0);
		System.out.println("Average salary:" + femaleAveSal);
		
		
		

	}
	
	// Create Sex Enum
	static enum Sex{
		MALE, FEMALE;
	}
	
	// Create Job Enum
	static enum Job{
		WORK,NOTWORK;
	}
	
	
	
	// Create class Student
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

}
