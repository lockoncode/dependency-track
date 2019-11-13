package org.dependencytrack.notification.vo;

public class ProjectOutdatedDependency {
    public String getProjectName() {
        return projectName;
    }

    public String getComponentName() {
        return componentName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    private final String projectName;
    private final String componentName;
    private final String projectVersion;
    private final String latestVersion;

    public ProjectOutdatedDependency(String projectName, String componentName, String projectVersion, String latestVersion) {
        this.projectName = projectName;
        this.componentName = componentName;
        this.projectVersion = projectVersion;
        this.latestVersion = latestVersion;
    }

}
