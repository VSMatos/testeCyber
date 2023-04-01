import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testes.FrameTest;
import testes.SliderTest;
import testes.DatePickerTest;
import testes.RegisterTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegisterTest.class,
        FrameTest.class,
        DatePickerTest.class,
        SliderTest.class,
})

public class SuiteTestes {
}
