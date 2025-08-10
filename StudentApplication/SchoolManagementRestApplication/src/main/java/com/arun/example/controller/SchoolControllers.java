package com.arun.example.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arun.example.entities.School;
import com.arun.example.services.SchoolService;

@RestController
@RequestMapping
public class SchoolControllers {

    @Autowired
    private SchoolService schoolService;
    
    @PostMapping("/addSchool")
    public School saveSchool(@RequestBody School school) {
    	return schoolService.saveSchool(school);
    }
    
    @GetMapping("getAllSchools")
    public List<School> getAllSchools() {
    	return schoolService.findAllSchools();
    }
    
    @PutMapping("/update/{id}")
    public School update(@PathVariable Long id, @RequestBody School s) {
    return schoolService.updateSchool(id, s);
    }
    
    @PatchMapping("/patch/{id}")
    public School patchName(@PathVariable Long id, @RequestBody String name) {
    	return schoolService.patchSchoolName(id, name);
    }
    
    @DeleteMapping("/deleteSchool/{id}")
    public void delete(@PathVariable Long id) {
    	schoolService.deleteSchool(id);
    }
    
    @GetMapping("/school/{schoolAddress}")
    public List<School> getSchoolByAddress(@PathVariable  String schoolAddress){
    	return schoolService.getSchoolByAddress(schoolAddress);
    }
    
    @DeleteMapping("/school/{schoolAddress}")
    public void deleteByAddress(@PathVariable String schoolAddress) {
    	schoolService.deleteByAddress(schoolAddress);
    }
    
    @GetMapping("/search")
    public List<School> searchSchools(@RequestParam String keyword) {
        return schoolService.searchSchoolsByName(keyword);
    }
    
}
