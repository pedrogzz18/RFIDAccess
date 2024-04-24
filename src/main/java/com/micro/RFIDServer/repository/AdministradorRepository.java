package com.micro.RFIDServer.repository;
import com.micro.RFIDServer.model.Administrador;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AdministradorRepository extends CrudRepository<Administrador, Integer>{

}