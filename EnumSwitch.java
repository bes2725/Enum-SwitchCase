/*Bailey Spicer
**3/16/16
**bes2725@email.vccs.edu
**This program will use joptionpane to prompt the user the select a month of the year and 
**output different text options depending on the selection.  It will also loop until a
**selection is made*/

import javax.swing.JOptionPane;

public class EnumSwitch
{	
	public enum MonthSelect {January, February, March, April, May, June, July, August, 
		September, October, November, December}

	public static void main(String[] args)
	{
		//create enum array
		MonthSelect [] choices = {MonthSelect.January, MonthSelect.February, 
			MonthSelect.March, MonthSelect.April, MonthSelect.May, 
			MonthSelect.June, MonthSelect.July, MonthSelect.August, 
			MonthSelect.September, MonthSelect.October, MonthSelect.November, 
			MonthSelect.December};
		//joptionpane to select
                MonthSelect select = (MonthSelect)JOptionPane.showInputDialog(null, "What"
			+ " month is it?", "Month", JOptionPane.INFORMATION_MESSAGE, null,
			choices, choices [0]);

		while (select != null)
		{
		switch (select)
		{
			case January:
				JOptionPane.showMessageDialog(null, "Do you want to build "
					+ "a snowman?");
				break;
			case February:
				 JOptionPane.showMessageDialog(null, "Do you want to build "
				 	+ "a snowman?");
				break;
			case March:
				 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
				break;
			case April:
				 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
				break;
			case May:
				 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
				break;
			case June:
				 JOptionPane.showMessageDialog(null, "It's summer time!");
				break;
			case July:
				 JOptionPane.showMessageDialog(null, "It's summer time!");
				break;
			case August:
				 JOptionPane.showMessageDialog(null, "It's summer time!");
				break;
			case September:
				 JOptionPane.showMessageDialog(null, "Welcome to the "
				 + "foliage season!");
				break;
			case October:
				 JOptionPane.showMessageDialog(null, "Welcome to the "
				 + "foliage season!");
				break;
			case November:
				 JOptionPane.showMessageDialog(null, "Welcome to the "
				 + "foliage season!");
				break;
			case December:
				 JOptionPane.showMessageDialog(null, "Do you want to build "
				 	+ "a snowman?");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Something went wrong.");
				break;

		}
		        select = (MonthSelect)JOptionPane.showInputDialog(null, "message",
				"Month", JOptionPane.QUESTION_MESSAGE, null, choices,					       choices [0]);

		}
	}
}
