package com.github.wangmingliangms.azureintellijplugin.services

import com.github.wangmingliangms.azureintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
