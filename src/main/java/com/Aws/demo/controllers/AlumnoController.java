package com.Aws.demo.controllers;

import com.Aws.demo.entities.Alumno;
import com.Aws.demo.services.interfaces.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("alumno")
public class
AlumnoController {

    @Autowired
    private IAlumnoService service;

    @GetMapping("materia/{materiaId}")
    public List<Alumno> getAllAlumnosByMateriaId(@PathVariable Long materiaId) {
        return service.getAllAlumnosByMateriaId(materiaId);
    }
}
