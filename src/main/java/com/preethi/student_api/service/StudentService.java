package com.preethi.student_api.service;

import com.preethi.student_api.model.Student;
import com.preethi.student_api.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Create
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Read All
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Read by ID
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Update
    public Optional<Student> updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id).map(student -> {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setAge(updatedStudent.getAge());
            student.setCourse(updatedStudent.getCourse());
            student.setMarks(updatedStudent.getMarks());
            return studentRepository.save(student);
        });
    }

    // Delete
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
