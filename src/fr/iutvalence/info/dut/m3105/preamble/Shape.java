package fr.iutvalence.info.dut.m3105.preamble;

public abstract class Shape
{
	public void Draw(Position posi) {
		System.out.printf("%s @ %s\n", toString(),posi);
	}
}
