package testing;

import validation.Datevalide;
import validation.ValidationDate;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Datevalide dt=new Datevalide(29, 2, 2012);
ValidationDate validation=new ValidationDate();
 boolean verification=validation.validJour(dt.getJour(), dt.getMois(), dt.getAn());
if(verification) 
{
System.out.println(dt.toString()+" est valide");

}
System.out.println(verification);

if(validation.validJour(dt.getJour(), dt.getMois(), dt.getAn()) ==false)
System.out.println(dt.toString()+" n'est pas valide");

	}

}

