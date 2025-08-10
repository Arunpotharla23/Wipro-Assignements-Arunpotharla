package com.arun.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.arun.example.entities.School;
import com.arun.example.entities.Teacher;
import com.arun.example.entities.Teacher.Qualification;
import com.arun.example.repo.SchoolRepository;
import com.arun.example.repo.TeacherRepository;

import java.time.LocalDate;

@SpringBootApplication
public class SchoolManagementRestApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementRestApiApplication.class, args);
    }

    @Bean
    CommandLineRunner loadData(TeacherRepository teacherRepo, SchoolRepository schoolRepo) {
        return args -> {
            Teacher t1 = new Teacher(0, "Arun Potharla", "Hyderabad", Qualification.PHD, 45, LocalDate.of(1980, 5, 15), 20);
            Teacher t2 = new Teacher(0, "Vamshi Potharla", "Mumbai", Qualification.MSC, 50, LocalDate.of(1975, 3, 10), 25);
            Teacher t3 = new Teacher(0, "Devaiah Potharla", "Chennai", Qualification.BTECH, 38, LocalDate.of(1985, 8, 20), 15);
            Teacher t4 = new Teacher(0, "Manjula", "Bangalore", Qualification.MTECH, 42, LocalDate.of(1981, 11, 30), 18);
            Teacher t5 = new Teacher(0, "Naveen", "Delhi", Qualification.PHD, 48, LocalDate.of(1977, 4, 5), 22);
            Teacher t6 = new Teacher(0, "Anil kumar", "Pune", Qualification.MSC, 35, LocalDate.of(1986, 7, 14), 12);
            Teacher t7 = new Teacher(0, "Ajay yadav", "Kolkata", Qualification.BSC, 40, LocalDate.of(1982, 1, 25), 17);
            Teacher t8 = new Teacher(0, "Mahesh kumar", "Chennai", Qualification.PHD, 55, LocalDate.of(1967, 9, 9), 30);

            teacherRepo.save(t1);
            teacherRepo.save(t2);
            teacherRepo.save(t3);
            teacherRepo.save(t4);
            teacherRepo.save(t5);
            teacherRepo.save(t6);
            teacherRepo.save(t7);
            teacherRepo.save(t8);

            School s1 = new School(0, "Sunrise Public School", "Hyderabad", t1.getId());
            School s2 = new School(0, "Greenwood High", "Mumbai", t2.getId());
            School s3 = new School(0, "SR Academy", "Chennai", t3.getId());
            School s4 = new School(0, "Green Leaf School", "Bangalore", t4.getId());
            School s5 = new School(0, "Celestial School", "Delhi", t5.getId());
            School s6 = new School(0, "Oakridge International", "Pune", t6.getId());
            School s7 = new School(0, "Hillview School", "Kolkata", t7.getId());
            School s8 = new School(0, "CMR School", "Chennai", t8.getId());
            schoolRepo.save(s1);
            schoolRepo.save(s2);
            schoolRepo.save(s3);
            schoolRepo.save(s4);
            schoolRepo.save(s5);
            schoolRepo.save(s6);
            schoolRepo.save(s7);
            schoolRepo.save(s8);

        };
    }
}
