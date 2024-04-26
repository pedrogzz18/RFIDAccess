package com.micro.RFIDServer.service.impl;
import com.micro.RFIDServer.model.Residente;
import com.micro.RFIDServer.service.ResidenteService;
import java.util.Optional;
import java.util.List;
import com.micro.RFIDServer.repository.ResidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResidenteServiceImpl implements ResidenteService{
    @Autowired
    private ResidenteRepository residenteRepository;

    @Override
    public Residente createResidente(Residente residente){
        return residenteRepository.save(residente);
    }

    @Override
    public Residente updateResidenteById(Residente new_residente, int id){
        return residenteRepository.save(new_residente);
    }

    @Override
    public void deleteResidenteById(int id){
        residenteRepository.deleteById(id);
    }

    @Override
    public Optional<Residente> getResidenteById(int id){
        return residenteRepository.findById(id);
    }

    @Override
    public List<Residente> getResidentes(){
        return (List<Residente>) residenteRepository.findAll();
    }
}