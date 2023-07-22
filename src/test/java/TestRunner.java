import org.junit.platform.engine.discovery.ClassNameFilter;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.io.PrintWriter;

public class TestRunner {
    public static void main(String[] args) {
        String[] testClassPatterns = {
                "ModerateJsonTests.*"
        };

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectPackage("ModerateJsonTests"))
                .filters(ClassNameFilter.includeClassNamePatterns(testClassPatterns))
                .build();

        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out));

        System.out.println("Test run was successful: " + summary.getTestsSucceededCount());
////////////////////////////////////////// All tests somehow could not be combined?? Therefore, separated as below
        String[] testClassPatterns2 = {
                "DifficultJsonTests.*"
        };

        LauncherDiscoveryRequest request2 = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectPackage("DifficultJsonTests"))
                .filters(ClassNameFilter.includeClassNamePatterns(testClassPatterns2))
                .build();

        Launcher launcher2 = LauncherFactory.create();
        SummaryGeneratingListener listener2 = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener2);
        launcher.execute(request2);

        TestExecutionSummary summary2 = listener2.getSummary();
        summary2.printTo(new PrintWriter(System.out));

        System.out.println("Test run was successful: " + summary2.getTestsSucceededCount());



    }
}
