import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "HN607384K", 35000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", developer.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("HN607384K", developer.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(350.00,developer.payBonus(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(36000.00, developer.getSalary(), 0.01);
    }
}
