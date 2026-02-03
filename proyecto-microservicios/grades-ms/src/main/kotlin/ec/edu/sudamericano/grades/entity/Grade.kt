package ec.edu.sudamericano.grades.entity


import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name="grades")
class Grade {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var subject: String? = null
    var grade: BigDecimal? = null
    var studentId: Int? = null

}