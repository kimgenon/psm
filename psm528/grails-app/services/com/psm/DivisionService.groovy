package com.psm

import grails.transaction.Transactional

@Transactional
class DivisionService {
	Division createNewDivision(Map divisionMap){
		def newDivision = new Division(chief: new Chief())

		newDivision.with {
			divisionName = divisionMap.divisionName
			chief.firstName = divisionMap.firstName
			chief.middleName = divisionMap.middleName
			chief.lastName = divisionMap.lastName
		}
		newDivision.save()
	}

	Division updateOldDivision(Map divisionMap, params){
		def newDivision = Division.get(params.id)
		newDivision.chief.with {
			division.divisionName = divisionMap.divisionName
			firstName = divisionMap.firstName
			middleName = divisionMap.middleName
			lastName = divisionMap.lastName
		}
		newDivision.save()
	}	
    def serviceMethod() {

    }
}
