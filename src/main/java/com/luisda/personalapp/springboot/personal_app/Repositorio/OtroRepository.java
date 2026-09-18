package com.luisda.personalapp.springboot.personal_app.Repositorio;

import com.Cesde.concesionario.Modelo.MOtro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OtroRepository extends JpaRepository<MOtro, String> {

    List<MOtro> findByIdContabilidad(String idContabilidad);

}