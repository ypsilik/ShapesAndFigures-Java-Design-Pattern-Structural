package fr.iutvalence.info.dut.m3105.preamble;

public class RectangleBuilder
{
	private Shape currentShape;
	
	public RectangleBuilder(int width, int height) {
		currentShape = new Rectangle(width, height);
	}
	
	public RectangleBuilder fill(int red, int green, int blue) {
		currentShape =  new Fill(currentShape, red, green, blue);
		return this;
	}
	
	
	public Shape toRectangle() {
		return currentShape;
	}

	public RectangleBuilder withShadow(int angle, int intensity)
	{
		currentShape = new Shadow(currentShape, angle, intensity);
		return this;
	}

	public RectangleBuilder withBorder(int thickness)
	{
		currentShape = new Border(currentShape, thickness);
		return this;
	}
}
