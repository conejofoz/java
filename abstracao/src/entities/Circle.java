package entities;

import entities.enums.Color;

public class Circle extends Shape {
	private Double radius;
	private Color color;
	
	public Circle() {
		super();
	}

	public Circle(Double radius, Color color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public Double area() {
		return Math.PI * radius * radius;
	}
}
