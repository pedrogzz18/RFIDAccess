package com.micro.RFIDServer.service;
import com.micro.RFIDServer.model.Administrador;
import java.util.Optional;


public interface AdministradorService{
    public Administrador createAdministrador(Administrador admin);

    public Administrador updateAdministradorById(Administrador new_admin, int admin_id);

    public void deleteAdministradorById(int admin_id);

    public Optional<Administrador> getAdministradorById(int admin_id);
}