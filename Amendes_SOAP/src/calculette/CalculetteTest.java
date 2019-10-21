package calculette;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CalculetteTest {

    private CalculetteImpl calc;

    @BeforeClass
    public void setUp() throws Exception {
       calc = new CalculetteImpl();
    }

    @AfterClass
    public void tearDown() throws Exception {
        calc = null;
    }

    @Test
    public void testAjouter() throws Exception {
        assertEquals(calc.ajouter(2,3),5);
    }

    @Test
    public void testSoustraire() throws Exception {
        assertEquals(calc.soustraire(2,3),-1);
    }
}