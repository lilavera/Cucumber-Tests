package ogorek;

import main.Bankomat;
import org.junit.Assert;
import org.junit.Test;

public class TestBank {

    @Test
    public void payIn(){
        Bankomat atm = new Bankomat();
        atm.wplataP(200);
        Assert.assertTrue(true);

    }

    @Test
    public void payOut(){
        Bankomat atm = new Bankomat();
        atm.wyplataP(200);
        Assert.assertTrue(true);

    }
}
