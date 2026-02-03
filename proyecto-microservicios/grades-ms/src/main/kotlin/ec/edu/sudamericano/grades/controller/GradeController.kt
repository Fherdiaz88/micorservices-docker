package ec.edu.sudamericano.grades.controller

import ec.edu.sudamericano.grades.service.GradeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RestController
@RequestMapping("/grades")
class StudentController(private val gradeService: GradeService) {

    @GetMapping
    fun list(): ResponseEntity<*> {
        return  ResponseEntity(gradeService.list(), HttpStatus.OK)
    }
}