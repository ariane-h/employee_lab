import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Brenda", "LD508940C", 30000.00, "HR");
    }
    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }
    @Test
    public void hasSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(300.00, manager.payBonus(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(31000.00, manager.getSalary(), 0.01);
    }
}
