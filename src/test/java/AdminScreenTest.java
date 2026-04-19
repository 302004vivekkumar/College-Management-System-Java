import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.assertj.swing.core.matcher.JButtonMatcher;
import org.junit.Test;
import com.mycompany.college.app.Admin;
import javax.swing.JFrame;

public class AdminScreenTest extends AssertJSwingJUnitTestCase {
    private FrameFixture window;

    @Override
    protected void onSetUp() {
        // Launches the Admin frame before every single test
        Admin frame = GuiActionRunner.execute(() -> new Admin());
        window = new FrameFixture(robot(), frame);
        window.show(); 
    }

    @Test
    public void testAddStudentNavigation() {
        // Clicks the button by text - no naming required!
        window.button(JButtonMatcher.withText("Add Student")).click();
        
        // Optional: Verify that the Admin window is now hidden or a new one is shown
        window.requireNotVisible();
        System.out.println("Add Student Navigation: PASSED");
    }

    @Test
    public void testSearchStudentNavigation() {
        window.button(JButtonMatcher.withText("Search Student")).click();
        window.requireNotVisible();
        System.out.println("Search Student Navigation: PASSED");
    }

    @Test
    public void testUpdateStudentNavigation() {
        window.button(JButtonMatcher.withText("Update Student")).click();
        window.requireNotVisible();
        System.out.println("Update Student Navigation: PASSED");
    }

    @Test
    public void testDeleteStudentNavigation() {
        window.button(JButtonMatcher.withText("Delete Student")).click();
        window.requireNotVisible();
        System.out.println("Delete Student Navigation: PASSED");
    }
}