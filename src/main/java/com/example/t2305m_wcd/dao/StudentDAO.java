package com.example.t2305m_wcd.dao;

import com.example.t2305m_wcd.entity.Student;

import java.util.List;

public class StudentDAO implements DAOInterface<Student,Long> {
    @Override
    public List<Student> all() {
        String sql = "SELECT * FROM students";
        return null;
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Student find(Long id) {
        return null;
    }
}
