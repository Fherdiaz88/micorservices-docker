package ec.edu.sudamericano.students.entity


import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name="students")
class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var fullname: String? = null
    var age: Int? = null
    var email: String? = null
}

