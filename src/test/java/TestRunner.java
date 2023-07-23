import org.junit.platform.engine.discovery.ClassNameFilter;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestRunner {
    public static void main(String[] args) {
        runTestsForPackage("ModerateJsonTests");
        runTestsForPackage("DifficultJsonTests");
        runTestsForPackage("JavaStreams");
    }

    private static void runTestsForPackage(String packageName) {
        String classPattern = packageName + ".*";
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectPackage(packageName))
                .filters(ClassNameFilter.includeClassNamePatterns(classPattern))
                .build();

        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        // Redirect standard output and error streams
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        System.setOut(new PrintStream(outStream));
        System.setErr(new PrintStream(errStream));

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        // Reset standard output and error streams
        System.setOut(originalOut);
        System.setErr(originalErr);

        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out));

        System.out.println("Test run was successful: " + summary.getTestsSucceededCount());
    }
}
