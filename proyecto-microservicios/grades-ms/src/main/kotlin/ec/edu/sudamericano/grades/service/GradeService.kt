package ec.edu.sudamericano.grades.service

import ec.edu.sudamericano.grades.entity.Grade
import ec.edu.sudamericano.grades.repository.GradeRepository
import org.springframework.stereotype.Service

@Service
class GradeService(private val gradeRepository: GradeRepository) {

    fun list ():List<Grade>{
        return gradeRepository.findAll()
    }

}