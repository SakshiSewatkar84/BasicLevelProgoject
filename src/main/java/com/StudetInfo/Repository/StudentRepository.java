package com.StudetInfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudetInfo.Model.StudentModel;
@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

}
