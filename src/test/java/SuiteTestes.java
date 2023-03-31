import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testes.FrameTest;
import testes.CenarioQuatro;
import testes.DatePickerTest;
import testes.RegisterTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegisterTest.class,
        FrameTest.class,
        DatePickerTest.class,
        CenarioQuatro.class,
})

public class SuiteTestes {
}
