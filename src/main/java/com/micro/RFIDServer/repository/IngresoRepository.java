package com.micro.RFIDServer.repository;
import com.micro.RFIDServer.model.Ingreso;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IngresoRepository extends CrudRepository<Ingreso, Integer>{

}