package testing;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import validation.ValidationDate;

public class TestVerif {
ValidationDate valide;
@Before
public void initialise()
{
valide=new ValidationDate();

}
@Test
public void verifan()
{
assertTrue(valide.bissextile(2020));	
}
@Test
public void verifierdate()
{
assertTrue(valide.validJour(29, 2, 2003));	
}
}
