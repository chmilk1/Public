import java.util.Scanner;

import javax.swing.text.Highlighter.HighlightPainter;

public class Popular {
	Scanner sca = new Scanner(System.in);
public static void main(String[] args) {
	Popular p = new Popular();
	p.run();
}
private void run(){
	try {
		hipThings(sca.next());
	} catch (NotCoolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void hipThings(String s) throws NotCoolException{
	if (s.length()>15){
		throw new NotCoolException("definitly is not cool and was never cool");
	} else if (s.endsWith("5000") || s.endsWith("a") || s.endsWith("craft")) {
		throw new OutOfStyleException("out of style");
	} else {
		System.out.println("its ok");
	}
}
//Create a “hipThings” method that will throw a NotCoolException, and/or OutOfStyleException if an input is uncool.

//Use syso and the Scanner class to ask the user for everyday things and call the hipThings’ Method

}
