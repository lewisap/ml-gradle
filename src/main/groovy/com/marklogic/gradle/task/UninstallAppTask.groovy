package com.marklogic.gradle.task

import org.gradle.api.tasks.TaskAction

class UninstallAppTask extends MarkLogicTask {

    @TaskAction
    void uninstallApp() {
        println "Uninstalling application"
        getAppDeployer().uninstallApp(getAppConfig())
        println "Finished uninstalling application"
    }
}
