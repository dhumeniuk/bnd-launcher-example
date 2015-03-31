package example.integration;

import java.io.File;

import junit.framework.TestCase;

import aQute.bnd.build.Project;
import aQute.bnd.build.ProjectLauncher;
import aQute.bnd.build.Workspace;

public class ExampleTest extends TestCase {

    public void testExample() throws Exception {
    	Workspace workspace = Workspace.getWorkspace(new File("").getAbsoluteFile().getParentFile());
        workspace.clear();
        Project project = workspace.getProject("example.integration");
        project.setTrace(true);
        project.clear();
        project.forceRefresh();
        assertTrue(project.check());
        
        ProjectLauncher launch = project.getProjectLauncher();
        launch.setTrace(true);
        launch.launch();
    }
}
