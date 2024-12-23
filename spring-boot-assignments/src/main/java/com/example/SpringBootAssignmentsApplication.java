package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.auto.Student;
import com.example.auto1.Restaurant;
import com.example.auto2.Performer;
import com.example.auto3.CarFactory;
import com.example.auto4.Theatre;
import com.example.auto5.GamesArena;

@SpringBootApplication
public class SpringBootAssignmentsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentsApplication.class, args);
	}

	private Student student;
	@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}
	@Autowired
	private Restaurant restaurant;
	
	@Autowired
	private Performer performer;
	
	private CarFactory carFactory;
	@Autowired
	public void setCarFactory(CarFactory carFactory) {
		this.carFactory = carFactory;
	}
	@Autowired
	private Theatre theatre;
	@Autowired
	private GamesArena gamesArena;

	@Override
	public void run(String... args) throws Exception {
//		student.showCourses("fronend").forEach(System.out::println);
//		student.showCourses("backend").forEach(System.out::println);
//		student.showCourses("cloud").forEach(System.out::println);
//		
//		System.out.println();
//		restaurant.displayMenu();
//		System.out.println();
//		performer.bandMusic("we wish you a merry christmas","g");
//		System.out.println();
//		carFactory.checkBrands("s").forEach(System.out::println);
		
		System.out.println();
//		theatre.moviesRunning("t","Tamil").forEach(System.out::println);
		
		System.out.println();
		gamesArena.showGames();
	}

}
