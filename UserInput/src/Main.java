import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scanner.nextLine();
		
		System.out.println("Hello "+name+", how old are you?");
		int age = scanner.nextInt();
		scanner.nextLine(); // "Limpa o buffer"
		
		System.out.println("How, you are "+age+" years old!! And what's your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hey, "+food+" is my favorite food too");

	}

}
