package Joogid_KT;

public class AppTest{

    @Before public void start(){
        Jook o = new Jook("Coca", 1, 1.2);
        Joogipudel p = new Joogipudel(2.0, "Plastmass", 0.1, 0.1, o);
    }

    @Test public void massKokkuTest(){
        double massKokku = (0.1 + (1.2 * 2.0));
        assertEquals(massKokku, p.massKokku(), 0.1); 
    }
}