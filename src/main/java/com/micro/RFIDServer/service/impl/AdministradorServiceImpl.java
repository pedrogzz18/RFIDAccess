package com.micro.RFIDServer.service.impl;
import com.micro.RFIDServer.model.Administrador;
import com.micro.RFIDServer.service.AdministradorService;
import java.util.Optional;
import com.micro.RFIDServer.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl implements AdministradorService{
    @Autowired
    private AdministradorRepository administradorRepository;

    @Override
    public Administrador createAdministrador(Administrador admin){
        return administradorRepository.save(admin);
    }

    @Override
    public Administrador updateAdministradorById(Administrador new_admin, int admin_id){
        return administradorRepository.save(new_admin);
    }

    @Override
    public void deleteAdministradorById(int admin_id){
        administradorRepository.deleteById(admin_id);
    }

    @Override
    public Optional<Administrador> getAdministradorById(int admin_id){
        return administradorRepository.findById(admin_id);
    }
}