package ec.edu.sudamericano.students.client

import ec.edu.sudamericano.students.dto.GradeDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "GRADES-MS", url = "\${external.grades.ms.base-url}")
interface GradesFeignClient {

    @GetMapping("/grades")
    fun getGrades():List<GradeDto>
}