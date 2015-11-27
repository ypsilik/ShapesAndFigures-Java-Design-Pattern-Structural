package fr.iutvalence.info.dut.m3105.preamble;

public class CircleBuilder
{
	private Shape currentShape;
	
	public CircleBuilder(int radius) {
		currentShape = new Circle(radius);
	}
	
	public CircleBuilder fill(int red, int green, int blue) {
		currentShape =  new Fill(currentShape, red, green, blue);
		return this;
	}
	
	
	public Shape toCircle() {
		return currentShape;
	}

	public CircleBuilder withShadow(int angle, int intensity)
	{
		currentShape = new Shadow(currentShape, angle, intensity);
		return this;
	}

	public CircleBuilder withBorder(int thickness)
	{
		currentShape = new Border(currentShape, thickness);
		return this;
	}
}