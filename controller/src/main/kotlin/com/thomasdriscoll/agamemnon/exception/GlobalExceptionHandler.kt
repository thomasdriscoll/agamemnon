package com.thomasdriscoll.agamemnon.exception

import com.thomasdriscoll.agamemnon.lib.exceptions.DriscollException
import com.thomasdriscoll.agamemnon.lib.responses.DriscollResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(DriscollException::class)
    fun agamemnonExceptions(e: DriscollException): ResponseEntity<DriscollResponse<String>> {
        return ResponseEntity.status(e.status).body(DriscollResponse(e.status.value(), e.message))
    }

}