import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Derek","SG6536G6",28000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Derek", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("SG6536G6", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(28000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(280, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(29000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
        public void protectedFromNegativeSalary(){
        databaseAdmin.raiseSalary(-1000.00);
        assertEquals(28000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Hamish");
        assertEquals("Hamish", databaseAdmin.getName());
        databaseAdmin.setName(null);
        assertEquals("Hamish", databaseAdmin.getName());
    }
}
