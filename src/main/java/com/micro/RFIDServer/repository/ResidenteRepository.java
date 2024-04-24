package com.micro.RFIDServer.repository;
import com.micro.RFIDServer.model.Residente;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ResidenteRepository extends CrudRepository<Residente, Integer>{

}