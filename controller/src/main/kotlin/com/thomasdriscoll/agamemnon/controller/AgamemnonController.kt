package com.thomasdriscoll.agamemnon.controller

import com.thomasdriscoll.agamemnon.lib.responses.DriscollResponse
import com.thomasdriscoll.agamemnon.service.AgamemnonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable

@RestController
class AgamemnonController(
        private val agamemnonService : AgamemnonService
) {
    @GetMapping("/{name}")
    fun sanityCheck(
            @PathVariable name: String
    ) : ResponseEntity<DriscollResponse<String>>{
        return ResponseEntity.ok().body(DriscollResponse(HttpStatus.OK.value(), agamemnonService.dummyFunction(name)))
    }

}