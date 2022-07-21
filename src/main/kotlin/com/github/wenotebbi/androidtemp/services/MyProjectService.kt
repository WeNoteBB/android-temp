package com.github.wenotebbi.androidtemp.services

import com.intellij.openapi.project.Project
import com.github.wenotebbi.androidtemp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
