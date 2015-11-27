package fr.iutvalence.info.dut.m3105.preamble;

public class Circle extends Shape
{
	public int radius;

	/**
	 * @param radius
	 */
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	@Override
	public String toString()
	{
		return "Circle [radius=" + radius + "]";
	}

}
