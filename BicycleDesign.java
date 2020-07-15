package bicycleClassFiles

import java.lang.Math.*;
class Gears
{
	private int chainring;
	private int cog;
	//private int wheel;

	Gears(int chainring , int cog)
	{
		this.chainring  = chainring;
		this.cog = cog;
	}
	/*

	Gears(int chainring , int cog, int wheel)
	{
		this.chainring  = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}*/

	public double ratio()
	{
		return chainring/cog;
	}

/*
	public double gear_inches()
	{
		return 
	}*/
}


