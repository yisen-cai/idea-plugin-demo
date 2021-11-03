package com.github.yisencai.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.yisencai.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
