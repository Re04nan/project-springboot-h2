package com.project.springboot.sonda.repository;

import com.project.springboot.sonda.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
