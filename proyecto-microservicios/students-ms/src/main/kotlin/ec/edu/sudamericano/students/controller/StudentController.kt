package ec.edu.sudamericano.students.controller

import ec.edu.sudamericano.students.service.StudentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentController(private val studentService: StudentService) {

    @GetMapping
    fun list():ResponseEntity<*>{
        return  ResponseEntity(studentService.list(),HttpStatus.OK)
    }

    @GetMapping("/with-grades")
    fun listWithGrades():ResponseEntity<*>{
        return  ResponseEntity(studentService.getStudentWithGrades(),HttpStatus.OK)
    }
}