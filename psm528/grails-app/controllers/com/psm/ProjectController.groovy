package com.psm

class ProjectController {
	def projectService

	def createProject() { }
    def index() { }

    def saveProject() {
    	def getChiefId = Chief.findById(params.id)
    	if (getChiefId) {
    		def newProject = new Project(projectName: params.projectName, chief: getChiefId)
    		newProject.save()
    	}
    }

    
}
