package com.thomasdriscoll.template.service.service

import org.springframework.stereotype.Service

@Service
class TemplateService {

    fun dummyFunction(name: String) : String{
        return name
    }
}