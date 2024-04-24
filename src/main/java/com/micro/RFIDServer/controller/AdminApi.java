package com.micro.RFIDServer.controller;
import com.micro.RFIDServer.model.Administrador;
import com.micro.RFIDServer.service.impl.AdministradorServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@RestController
public class AdminApi{
    @Autowired private AdministradorServiceImpl administradorService;

    @PostMapping("/admin")
    public Administrador createAdministrador(@RequestBody Administrador admin)
    {
        return administradorService.createAdministrador(admin);
    }

    @GetMapping("/admin/{id}")
    public Optional<Administrador> getAdministradorById(@PathVariable("id") int id)
    {
        return administradorService.getAdministradorById(id);
    }

    @PutMapping("/admin/{id}")
    public Administrador updateAdministradorById(@RequestBody Administrador admin,
                     @PathVariable("id") int id)
    {
        return administradorService.updateAdministradorById(admin, id);
    }

    @DeleteMapping("/admin/{id}")
    public String deleteAdministradorById(@PathVariable("id") int id) {
        administradorService.deleteAdministradorById(id);
        return "Deleted Successfully";
    }
}