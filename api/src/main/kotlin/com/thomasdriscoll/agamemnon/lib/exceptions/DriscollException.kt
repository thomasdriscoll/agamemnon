package com.thomasdriscoll.agamemnon.lib.exceptions

import org.springframework.http.HttpStatus

class DriscollException(
        val status: HttpStatus,
        message: String
) : Exception(message)