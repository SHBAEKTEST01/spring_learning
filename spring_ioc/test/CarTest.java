import idv.bsh.spring.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by baek on 2017. 7. 16..
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/idv/bsh/spring/beanconfig.xml"})
public class CarTest {

    @Autowired
    Car car;

    @Test
    public void CarTireTest() {
        assertEquals("Korea Tire", car.getTireBrand());
    }
}