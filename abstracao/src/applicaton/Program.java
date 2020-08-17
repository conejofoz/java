package applicaton;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.enums.Color;
import entities.Circle;
import entities.Retangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//A lista foi criada da classe abstrata
		// Mais os objetos da lista foram instanciados de classes concretas
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Shape # " + i + " data:");
			System.out.println("Retangle or Circle (r/c): ");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color= Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				list.add(new Retangle(color, width, height));
			} else {
				System.out.println("Radios: ");
				double radius = sc.nextDouble();
				list.add(new Circle(radius, color));
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		for(Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		
		sc.close();

	}

}
