package repo;

import binding.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface CourseRepos extends JpaRepository <Course, Serializable> {



}
