import management.Director;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.net.PortUnreachableException;

import static org.junit.Assert.assertEquals;

public class DirectorTest{

    Director director;

    @Before
    public void before(){
        director = new Director("Ari", "GH76548H1",100000.00,"Department of Very Important People",15000000);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Department of Very Important People", director.getDeptName());
    }
    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0.01);
    }
//    @Test
//    public void canPayBonus(){
//        assertEquals(1000.00, director.payBonus(), 0.01);
//    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000.00);
        assertEquals(101000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(15000000, director.getBudget(), 0.01);
    }

    @Test
    public void directorHasHigherBonus(){
        assertEquals(2000.00,director.payBonus(), 0.01);
    }
}
