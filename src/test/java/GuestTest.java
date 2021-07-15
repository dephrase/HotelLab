import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setup(){
        guest = new Guest("John", RoomType.SUITE);
    }

    @Test
    public void guestHasName(){
        assertEquals("John", guest.getName());
    }
}
