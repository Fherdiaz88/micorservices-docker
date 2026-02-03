package ec.edu.sudamericano.grades.repository

import ec.edu.sudamericano.grades.entity.Grade
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GradeRepository: JpaRepository<Grade, Long> {
}