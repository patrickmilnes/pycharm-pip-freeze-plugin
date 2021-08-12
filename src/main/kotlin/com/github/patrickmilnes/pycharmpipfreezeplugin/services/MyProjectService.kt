package com.github.patrickmilnes.pycharmpipfreezeplugin.services

import com.github.patrickmilnes.pycharmpipfreezeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
