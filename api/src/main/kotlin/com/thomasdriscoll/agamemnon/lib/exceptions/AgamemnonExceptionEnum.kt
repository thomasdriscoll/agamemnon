package com.thomasdriscoll.agamemnon.lib.exceptions

import org.springframework.http.HttpStatus

enum class AgamemnonExceptionEnum(val status: HttpStatus, val message: String){
    TESTING_EXCEPTIONS(HttpStatus.BAD_REQUEST, "You done goofed")
}