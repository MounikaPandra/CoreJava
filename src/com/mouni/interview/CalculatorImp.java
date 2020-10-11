package com.mouni.interview;

interface Calculator
{
	/*void SwitchOn();
	void display(int input);*/
	
	int Sound(int x,int y);
	
}
public class CalculatorImp 
{
	
	public static void main(String[] args) 
	{
		/*Calculator cal = ()->System.out.println("Switched on");

		cal.SwitchOn();
		Calculator cal = (input) ->System.out.println(input);
		cal.display(55);*/
		Calculator cal =(x,y)->
		{
			if(y < x)
			{
				throw new RuntimeException("Y is lessthan X");
			}
			else 
				return y -x;
		};
		System.out.println(cal.Sound(20, 10));
}
}