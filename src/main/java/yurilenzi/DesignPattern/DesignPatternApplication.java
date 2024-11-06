package yurilenzi.DesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import yurilenzi.DesignPattern.Es1class.DataSource;
import yurilenzi.DesignPattern.Es1class.Info;
import yurilenzi.DesignPattern.Es1class.InfoAdapter;
import yurilenzi.DesignPattern.Es1class.UserData;

import java.time.LocalDate;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
		//Esercizio1
		System.out.println("------------Esercizio 1--------------");
		Info info = new Info("Yuri", "Lenzi", LocalDate.parse("1991-06-25"));

		InfoAdapter infoAdapter = new InfoAdapter(info);
		UserData userData = new UserData();
		userData.getData(infoAdapter);
		System.out.println(userData);

	}





}
