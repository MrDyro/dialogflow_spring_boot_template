package com.volkmar.dialogflow.rest

import com.volkmar.dialogflow.models.DialogflowRequest
import com.volkmar.dialogflow.models.DialogflowResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
open class IntentController {
    @RequestMapping(path = arrayOf("/intent"), method = arrayOf(RequestMethod.POST))
    fun processIntent(@RequestBody apiAiRequest: DialogflowRequest,
                      request: HttpServletRequest): ResponseEntity<Any> {

        // TODO: Add your stuff here

        return ResponseEntity.ok(DialogflowResponse(speech = "Hallo World",
                                                    displayText = "Hallo World",
                                                    data = emptyMap(),
                                                    contextOut = emptyList(),
                                                    source = "Service"))
    }
}