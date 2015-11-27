package fr.iutvalence.info.dut.m3105.preamble;

public class Shadow extends Shape
{
	public Shape shape;
	public int intensity;
	public int angle;
	
	/**
	 * @param shape
	 * @param intensity
	 * @param angle
	 */
	public Shadow(Shape shape, int intensity, int angle)
	{
		this.shape = shape;
		this.intensity = intensity;
		this.angle = angle;
	}
	
	@Override
	public String toString()
	{
		return "Shadow [shape=" + shape + ", intensity=" + intensity
				+ ", angle=" + angle + "]";
	}
	
	
	
}

