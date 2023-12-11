package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Runtime_pol {

	public static void main(String[] args) {
		WebDriver driver = null;

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter browser name");
		String Browsername = sc.next();
		if (Browsername.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (Browsername.equals("edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("Enter proper browser name");
		}

	}

}
