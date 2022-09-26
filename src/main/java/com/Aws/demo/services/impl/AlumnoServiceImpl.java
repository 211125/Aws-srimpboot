package com.Aws.demo.services.impl;

import com.Aws.demo.repositories.IAlumnoRepository;
import com.Aws.demo.services.interfaces.IAlumnoService;
import com.Aws.demo.entities.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

    @Autowired
    private IAlumnoRepository repository;


    @Override
    public List<Alumno> getAllAlumnosByMateriaId(Long materiaId) {
        return repository.getAllAlumnosByMateriaId(materiaId);
    }
}
