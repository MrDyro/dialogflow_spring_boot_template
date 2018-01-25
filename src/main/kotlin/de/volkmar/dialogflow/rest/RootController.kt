package de.volkmar.dialogflow.rest

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.servlet.http.HttpServletRequest


@Controller
class RootController {
    @RequestMapping(path = ["/"], method = [RequestMethod.GET])
    fun processIntent(request: HttpServletRequest): ResponseEntity<Any> {
        return ResponseEntity.ok("Halo i bims 1 server.")
    }
}