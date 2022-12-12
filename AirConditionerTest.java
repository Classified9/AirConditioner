package AC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void AcIsOn(){
        AirConditioner ac = new AirConditioner("Hisense");
        ac.setOn(true);
        assertTrue(ac.isOn());
    }

    @Test
    public void AcIsOff(){
        AirConditioner ac = new AirConditioner("Hisense");
        ac.setOn(true);
        //when i want to turn it off
        ac.setOn(false);
        //check my ac is off
        assertFalse(ac.isOn());
    }

    @Test
    public void AcTemperatureIncreased(){
        AirConditioner ac = new AirConditioner("Hisense");
        ac.setOn(true);
        //
        ac.increaseTemperature();
        // check that temperature increase
        assertEquals(17, ac.getTemperature());
    }

    @Test
    public void AcTemperatureDecreased(){
        AirConditioner ac = new AirConditioner("Hisense");
        ac.setOn(true);
        ac.increaseTemperature();
        //
        ac.decreaseTemperature();
        //check that my temperature decreases
        assertEquals(16, ac.getTemperature());
    }

    @Test
    public void AcTemperatureNotBeyond30(){
        AirConditioner ac = new AirConditioner("Hisense");
        ac.setOn(true);
        //when I increase temperature beyond 30
        ac.setTemperature(31);

        //temperature is still 30
        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void AcTemperatureNotBelow16(){
        AirConditioner ac = new AirConditioner("Hisense");
        ac.setOn(true);
        //when i decrease temperature below 16
//        ac.decreaseTemperature();
        ac.setTemperature(12);
        //check whether temperature is still 16
        assertEquals(16, ac.getTemperature());
    }


}
