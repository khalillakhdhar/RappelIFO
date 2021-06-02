package validation;

import java.util.Arrays;
import java.util.List;

public class ValidationDate {
	List<Integer> medium=Arrays.asList(4,6,9,11);
public boolean testJour(int jour)
{
return jour>=1 && jour<=31;	

}
public boolean testMois(int mois)
{
return mois>=1 && mois <=12; 	

}
public boolean bissextile(int an)
{
return an%4==0 && an%100!=0;	

}
public boolean annevalide(int an)
{
if((an<1000)||(an >3000))
{
return false;	
}
else return true;
}



}
