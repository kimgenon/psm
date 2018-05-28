package com.psm

class DivisionController {
	def divisionService

	def createDivision() { }
    
    def index() { 
    	redirect (action: 'listDivision')
    }

    def saveDivision() {

    	def getDivisionMap = [:]

    	getDivisionMap = [
    		divisionName: params.divisionName,
    		firstName: params.firstName,
    		middleName: params.middleName,
    		lastName: params.lastName
    	]

    	def saveDivision = divisionService.createNewDivision(getDivisionMap)

   		if (saveDivision) {
   		 	redirect (action: 'index')
   		 } else {
   		 	render 'Might have an error!'
   		 }
    }

    def updateDivision() {
    	def getDivisionMap = [:]

    	getDivisionMap = [
    		divisionName: params.divisionName,
    		firstName: params.firstName,
    		middleName: params.middleName,
    		lastName: params.lastName
    	]  
 
     	def updateDivision = divisionService.updateOldDivision(getDivisionMap, params)

   		if (updateDivision) {
   		 	redirect (action: 'index')
   		 } else {
   		 	render 'Might have an error!'
   		 }  	
    }

    def listDivision() {
    	def getDivisionList = Division.list()
    	[divisionListInstance: getDivisionList]
    }

    def editDivision() {
    	def getDivisionParamsForEdit = Division.get(params.id)
    	[divisionParamsInstanceEdit: getDivisionParamsForEdit]
    }

    def viewDivision() {
    	def getDivisionParamsForView = Division.get(params.id)
    	def getChiefId = Chief.findById(params.id)
    	def getProjectList = Project.where {
    		chief == getChiefId
    	}
    	[divisionParamsInstanceView: getDivisionParamsForView, projectListInstance: getProjectList]
    }

    def saveProject() {
    	def getChiefId = Chief.findById(params.id)
    	println getChiefId
    	// if (getChiefId) {
    	// 	def newProject = new Project(projectName: params.projectName, chief: getChiefId)
    	// 	newProject.save()
    	// }
    	// render 'hoy'
    }
}
