package com.psm

class Project {
	String projectName
	static belongsTo = [chief: Chief]
    static constraints = {
    }
}
