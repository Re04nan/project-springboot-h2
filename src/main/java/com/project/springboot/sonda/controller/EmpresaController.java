package com.project.springboot.sonda.controller;

import com.project.springboot.sonda.model.Empresa;
import com.project.springboot.sonda.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/listaEmpresas")
    public ResponseEntity<List<Empresa>> allEmpresas(){
        empresaService.saveEmpresas();
        return empresaService.listarEmpresas();
    }
}
