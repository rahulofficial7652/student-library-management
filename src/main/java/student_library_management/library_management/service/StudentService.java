package student_library_management.library_management.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import student_library_management.library_management.model.Student;
import student_library_management.library_management.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    // Save single student data
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    
    // Save multiple students at once
    public List<Student> saveAllStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }
    // find all student data

    public List <Student> getAllStudent(){
        return studentRepository.findAll();
    }
    public List<Student>  getStudentByPagination(int pageNo, int pageSize, Sort name){
        List <Student> studentList = studentRepository.findAll(PageRequest.of(pageNo, pageSize)).getContent();
        return studentList;
    }
}
