package fr.iutvalence.info.dut.m3105.preamble;

public class Fill extends Shape
{
	public Shape shape;
	public int colorRed;
	public int colorGreen;
	public int colorBlue;
	
	
	/**
	 * @param colorRed
	 * @param colorGreen
	 * @param colorBlue
	 * @param shape
	 */
	public Fill(Shape shape,int colorRed, int colorGreen, int colorBlue)
	{
		this.shape = shape;
		this.colorRed = colorRed;
		this.colorGreen = colorGreen;
		this.colorBlue = colorBlue;
		
	}


	@Override
	public String toString()
	{
		return "Fill [shape=" + shape + ", colorRed=" + colorRed
				+ ", colorGreen=" + colorGreen + ", colorBlue=" + colorBlue
				+ "]";
	}

	
	
	
	
}
