package com.github.akaame.namedparametersplugin.services

import com.intellij.openapi.project.Project
import com.github.akaame.namedparametersplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
