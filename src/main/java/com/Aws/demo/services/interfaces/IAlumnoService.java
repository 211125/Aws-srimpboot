package com.Aws.demo.services.interfaces;

import com.Aws.demo.entities.Alumno;

import java.util.List;

public interface IAlumnoService {

    List<Alumno> getAllAlumnosByMateriaId(Long materiaId);
}
