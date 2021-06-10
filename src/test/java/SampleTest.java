
import com.tasubo.dev.StarterUdf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    StarterUdf fun = new StarterUdf();

    @Test
    public void two_letter_code_should_be_converted_to_iso_code() {
        String outcome = fun.evaluate("CA");
        assertEquals("CAN", outcome);
    }

}