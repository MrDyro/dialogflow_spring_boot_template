package de.volkmar.dialogflow.rest

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.servlet.http.HttpServletRequest

@Controller
class WarmupController {
    @RequestMapping(path = ["/_ah/warmup"], method = [RequestMethod.GET])
    fun processIntent(request: HttpServletRequest): ResponseEntity<Any> {
        return ResponseEntity.ok("Engine started...")
    }
}