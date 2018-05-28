package com.psm

class Chief {
	String firstName
	String middleName
	String lastName
	Division division
	static hasMany = [managers: Manager, projects: Project]
    static constraints = {
    }
}
