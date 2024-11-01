package service;

import binding.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.CourseRepos;

import java.util.List;
import java.util.Optional;

@Service
public class servImpl implements CourseService{

    @Autowired
    private CourseRepos courseRepo;
    @Override
    public String upsert(Course course) {
        courseRepo.save(course); // upsert(insert / update based on pk)
        return "success";
    }

    @Override

    public Course getById(Integer cid) {
       Optional<Course> findById= courseRepo.findById(cid);
       if(findById.isPresent()){
           return findById.get();
       }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {

        return courseRepo.findAll();
    }

    @Override
    public String deleteById(Integer cid) {
        if(courseRepo.existsById(cid)){
            courseRepo.deleteById(cid);
            return "delete success";
        }
        return "no record found";
    }
}
