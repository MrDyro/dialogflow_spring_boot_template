package de.volkmar.dialogflow.rest

import de.volkmar.dialogflow.models.DialogflowRequest
import de.volkmar.dialogflow.models.DialogflowResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class IntentController {
    @RequestMapping(path = ["/intent"], method = [(RequestMethod.POST)])
    fun processIntent(@RequestBody dialogflowRequest: DialogflowRequest,
                      request: HttpServletRequest): ResponseEntity<Any> {

        print(dialogflowRequest)

        // TODO: Add your stuff here

        return ResponseEntity.ok(DialogflowResponse(speech = "Hallo World",
                                                    displayText = "Hallo World",
                                                    data = emptyMap(),
                                                    contextOut = emptyList(),
                                                    source = "Service"))
    }
}