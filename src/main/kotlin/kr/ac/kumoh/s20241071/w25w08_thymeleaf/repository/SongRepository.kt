package kr.ac.kumoh.s20241071.w25w08_thymeleaf.repository

import kr.ac.kumoh.s20241071.w25w08_thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    private val songs = listOf(
        Song(1,"Golden","HUNTR/X"),
        Song(2,"Blue Valentine","NMIXX"),
        Song(3, "타임캡슐", "다비치"),
    )
    fun findAll() = songs.toList()

    fun findById(id: Int): Song? {
        return songs.find { it.id == id }
    }

    fun count() = songs.size
}