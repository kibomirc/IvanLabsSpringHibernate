package com.mcroly.labsSpringRestHibernate.controller;

import com.mcroly.labsSpringRestHibernate.model.Student;
import com.mcroly.labsSpringRestHibernate.repositories.NoteRepository;
import com.mcroly.labsSpringRestHibernate.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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