package com.mcroly.labs.controller;

import com.mcroly.labs.model.Note;
import com.mcroly.labs.model.Student;
import com.mcroly.labs.repositories.NoteRepository;
import com.mcroly.labs.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/prova")
    public String prova(){

        studentService.persistService();
        return "prova";
    }

    @GetMapping("/provajson")
    @Produces(MediaType.APPLICATION_JSON)
    public ModelAndView jsonStudent(){
        Student student = new Student();
        student.setId(1L);
        student.setName("Ivan");
        student.setPassportNumber("12345");

        ModelAndView modelAndView = new ModelAndView("/json");
        modelAndView.addObject("student", student);

        return modelAndView;
    }
    @GetMapping("/welcome")
    public ModelAndView index() {
        //List<Note> notes = this.noteRepository.findAll();
        //ModelAndView modelAndView = new ModelAndView("/welcome");
        //modelAndView.addObject("data", notes);
        return new ModelAndView("welcome", "nome", "Ivan");
    }

}