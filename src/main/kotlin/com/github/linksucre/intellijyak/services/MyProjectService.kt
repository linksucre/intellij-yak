package com.github.linksucre.intellijyak.services

import com.github.linksucre.intellijyak.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
