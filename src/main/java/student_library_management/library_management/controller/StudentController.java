package student_library_management.library_management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import student_library_management.library_management.model.Student;
import student_library_management.library_management.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    
    @PostMapping("/saveAll")
    public List<Student> saveAllStudents(@RequestBody List<Student> students){
        return studentService.saveAllStudents(students);
    }
    @GetMapping("/findAll")
    public List<Student> findAllStudents(){
        List <Student> studentList  = studentService.getAllStudent();
        return studentList;
    }
    @GetMapping("/findByPage")
    public List<Student> findPagination(@RequestParam int pageNo, @RequestParam int pageSize){
        List <Student> studentList  = studentService.getStudentByPagination(pageNo, pageSize, Sort.by("name"));
        return studentList;
    }

}
