package com.thomasdriscoll.agamemnon.controller

import com.nhaarman.mockitokotlin2.*
import com.thomasdriscoll.agamemnon.lib.exceptions.AgamemnonExceptionEnum
import com.thomasdriscoll.agamemnon.lib.exceptions.DriscollException
import com.thomasdriscoll.agamemnon.lib.responses.DriscollResponse
import com.thomasdriscoll.agamemnon.service.AgamemnonService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

internal class AgamemnonControllerTest {
    private lateinit var agamemnonService: AgamemnonService
    private lateinit var agamemnonController: AgamemnonController
    private lateinit var mockMvc: MockMvc


    @BeforeEach
    fun setup(){
        agamemnonService = mock()
        agamemnonController = AgamemnonController(agamemnonService)
        mockMvc = standaloneSetup(agamemnonController)
                    .build()

    }

    private val NAME = "thomas"
    private val BNAME = "Brian"
    private val RESPONSE = DriscollResponse(HttpStatus.OK.value(), "Thomas")


    private val ERR = DriscollException(AgamemnonExceptionEnum.TESTING_EXCEPTIONS.status, AgamemnonExceptionEnum.TESTING_EXCEPTIONS.message)

//    @Nested
//    inner class SanityCheckTests{
//        @Test
//        fun `Test if it works`(){
//            whenever(agamemnonService.dummyFunction(NAME))
//                    .thenReturn(RESPONSE)
//
//            mockMvc.perform(get("/$NAME")
//                    .contentType(MediaType.APPLICATION_JSON))
//                    .andExpect(status().isOk) // this works
//                    .andExpect(content().toJSON(DriscollResponse(200, RESPONSE))))
//
//        }
//
//        @Test
//        fun `Test what happens when it breaks`(){
//            whenever(agamemnonService.dummyFunction(BNAME))
//                    .thenThrow(ERR)
//
//            mockMvc.perform(get("/$NAME")
//                    .contentType(MediaType.APPLICATION_JSON))
//                    .andExpect(status().isBadRequest) // this does not work
//                    //need to figure out how to check body
//
//        }
//    }
}