package com.volkmar.kug.rest

import com.volkmar.kug.models.ApiAiRequest
import com.volkmar.kug.models.ApiAiResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
open class IntentController {
    @RequestMapping(path = arrayOf("/intent"), method = arrayOf(RequestMethod.POST))
    fun processIntent(@RequestBody apiAiRequest: ApiAiRequest,
                      request: HttpServletRequest): ResponseEntity<Any> {

        // TODO: Add your stuff here

        return ResponseEntity.ok(ApiAiResponse("Hallo World", "Hallo World", emptyMap(), emptyList()))
    }
}