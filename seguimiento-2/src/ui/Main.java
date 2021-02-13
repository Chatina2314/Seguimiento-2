package ui;
import java.util.Scanner;
import model.Classroom;
public class Main {
	//Attributes
	private Classroom mainClassroom;
	//Relations
	private Classroom[] classroom;
	private ClassroomGUI[] classroomgui;
	// global variables
	public static Scanner lector;
	//Methods
	public Main() {
		lector = new Scanner(System.in);
		classroom = new Classroom[1];
		classroomgui = new ClassroomGUI[1];
	}
	public static void main(String args[]){
		Main objMain=new Main();
		boolean menu = true;
		int opcions = 0;
		while(menu) {
			System.out.println("1.- Sign Up.");
			System.out.println("2.- .");
			System.out.println("3.- Exit");
			
			System.out.println("Enter the action to perform: ");
			opcions=Integer.parseInt(lector.nextLine());
			switch(opcions){
				case 1:
				objMain.signUp();
				break;
				case 2:
				objMain.;
				break;
				case 3:
					menu=false;
					break;
					default:
					System.out.println("Only numbers between 1 and 27.");
					break;
		}
	}
}
