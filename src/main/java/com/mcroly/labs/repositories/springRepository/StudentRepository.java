
package com.mcroly.labs.repositories.springRepository;

import com.mcroly.labs.model.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Long> {

    //Page<Student> findAllByName(@Param("name") String name, Pageable page);

}
