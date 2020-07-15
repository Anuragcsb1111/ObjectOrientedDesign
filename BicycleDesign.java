package bicycleClassFiles

import java.lang.Math.*;
class Gears
{
	private int chainring;
	private int cog;
	private int wheel;

	Gears(int chainring , int cog)
	{
		this.chainring  = chainring;
		this.cog = cog;
	}

	Gears(int chainring , int cog, int wheel)
	{
		this.chainring  = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}

	public double ratio()
	{
		return chainring/cog;
	}

	public double gear_inches()
	{
		return 
	}
}


class Wheel
{
	private int rim;
	private int tire;

	Wheel(int rim, int tire)
	{
		this.rim = rim;
		this.tire = tire;
	}

	public int diameter()
	{
		return rim + (tire*2);
	}

	public double circumference()
	{
		int d = diameter();
		return d * Math.PI;
	}
}

public class BicycleDesign
{
	public static void main (String [] args)
	{
		Wheel wheel = new Wheel(26,1.5);

		System.out.println(wheel.circumference());
	}
}