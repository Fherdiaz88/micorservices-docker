package ec.edu.sudamericano.students.service

import ec.edu.sudamericano.students.client.GradesFeignClient
import ec.edu.sudamericano.students.dto.StudentsWithGradesDto
import ec.edu.sudamericano.students.entity.Student
import ec.edu.sudamericano.students.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    private val studentRepository: StudentRepository,
    private val gradesFeignClient: GradesFeignClient
) {

    fun list ():List<Student>{
        return studentRepository.findAll()
    }
    fun getStudentWithGrades(): List<StudentsWithGradesDto> {
        val students = studentRepository.findAll()
        val grades = gradesFeignClient.getGrades()
        return students.map { student ->
            val studentGrades = grades.filter { it.studentId == student.id }
            StudentsWithGradesDto(
                student.id,
                student.fullname,
                studentGrades
            )
        }

    }
}