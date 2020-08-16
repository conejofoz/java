import java.util.Scanner;

public class Forjava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i <=10; i++) { // o escopo da variável i deve ser local ao for
			System.out.println(i);
		}
		
		scanner.close();

	}

}
