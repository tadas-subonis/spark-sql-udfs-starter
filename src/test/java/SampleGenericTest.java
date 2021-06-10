import com.tasubo.dev.StarterGenericUdf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleGenericTest {
    StarterGenericUdf fun = new StarterGenericUdf();

    @Test
    public void two_letter_code_should_be_converted_to_iso_code() {
        String outcome = fun.evaluate("CA");
        assertEquals("CAN", outcome);
    }

}