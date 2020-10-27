package com.thomasdriscoll.agamemnon.lib.responses

class DriscollResponse <T> (
        val status: Int,
        val body: T?
)