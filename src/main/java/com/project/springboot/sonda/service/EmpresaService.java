package com.project.springboot.sonda.service;

import com.project.springboot.sonda.model.Empresa;
import com.project.springboot.sonda.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public ResponseEntity<List<Empresa>> listarEmpresas(){
        List<Empresa> lista = empresaRepository.findAll();
        return new ResponseEntity<List<Empresa>>(lista, HttpStatus.OK);
    }

    public void saveEmpresas(){
        Empresa empresa = new Empresa();

        empresa.setId(1L);
        empresa.setCnpj(80837973000119L);
        empresa.setEmail("sonda@contato.com");
        empresa.setNome("Sonda");
        empresaRepository.save(empresa);
    }
}
