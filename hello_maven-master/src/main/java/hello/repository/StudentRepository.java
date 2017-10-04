package hello.repository;

import hello.model.Student;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

    Student findByNeptun(String neptun);
    
    Student findBylastname(String lastname);

    @Query("select s.firstname from Student s where s.firstname like ?1%")
    List<Student> findByFirstNameSegment(String firstName);
}
