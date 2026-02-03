package ec.edu.sudamericano.students.dto

import java.math.BigDecimal

class StudentsWithGradesDto (
    val id: Long?,
    val fullname: String?,
    val grades: List<GradeDto>
)