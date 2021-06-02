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

public boolean validJour(int jour,int mois,int an)
{
	if(testJour(jour)&&(testMois(mois))&&(annevalide(an)))
	{
		if(medium.contains(mois))
			return jour<=30;
		else if(!medium.contains(mois))
		{
			if(mois==2)
			{
				if(bissextile(an))
					return jour<=29;
				else
					return jour<=28;
				
			}
			else
			{
				return jour<=31;
			}
		}
	}
	
	return false;
}

}
