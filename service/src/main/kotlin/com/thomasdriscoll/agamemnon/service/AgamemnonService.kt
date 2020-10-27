package com.thomasdriscoll.agamemnon.service

import com.thomasdriscoll.agamemnon.lib.exceptions.AgamemnonExceptionEnum
import com.thomasdriscoll.agamemnon.lib.exceptions.DriscollException
import org.springframework.stereotype.Service

@Service
class AgamemnonService {

    fun dummyFunction(name: String) : String{
        if(name == "Brian"){
            throw DriscollException(AgamemnonExceptionEnum.TESTING_EXCEPTIONS.status, AgamemnonExceptionEnum.TESTING_EXCEPTIONS.message)
        }
        return name
    }
}