package com.psm

import grails.transaction.Transactional

@Transactional
class ProjectService {
	Project createNewProject(Map projectMap){
		def newProject = new Project()
		newProject.with {
			projectName = projectMap.projectName
			chiefId = projectMap.chief
		}
		newProject.save()
	}
    def serviceMethod() {

    }
}
