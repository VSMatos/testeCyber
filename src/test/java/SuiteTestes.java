import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testes.FrameTest;
import testes.CenarioQuatro;
import testes.CenarioTres;
import testes.RegisterTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegisterTest.class,
        FrameTest.class,
        CenarioTres.class,
        CenarioQuatro.class,
})

public class SuiteTestes {
}
