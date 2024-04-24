package com.micro.RFIDServer.service.impl;
import com.micro.RFIDServer.model.Ingreso;
import com.micro.RFIDServer.service.IngresoService;
import java.util.Optional;
import com.micro.RFIDServer.repository.IngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngresoServiceImpl implements IngresoService{
    @Autowired
    private IngresoRepository ingresoRepository;

    @Override
    public Ingreso createIngreso(Ingreso ingreso){
        return ingresoRepository.save(ingreso);
    }

    @Override
    public Ingreso updateIngresoById(Ingreso new_ingreso, int id){
        return ingresoRepository.save(new_ingreso);
    }

    @Override
    public void deleteIngresoById(int id){
        ingresoRepository.deleteById(id);
    }

    @Override
    public Optional<Ingreso> getIngresoById(int id){
        return ingresoRepository.findById(id);
    }
}