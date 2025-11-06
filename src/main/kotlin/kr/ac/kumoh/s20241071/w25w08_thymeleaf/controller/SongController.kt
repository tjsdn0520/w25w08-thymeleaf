package kr.ac.kumoh.s20241071.w25w08_thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong(model: Model): String {
        return "random"
    }
}