package kr.ac.kumoh.s20241071.w25w08_thymeleaf.controller

import kr.ac.kumoh.s20241071.w25w08_thymeleaf.service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController(
    private val service: SongService
) {
    @GetMapping("/songs/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("songTitle",service.getRandomSong()?.title?: "노래 없음")
        return "random"
    }
}