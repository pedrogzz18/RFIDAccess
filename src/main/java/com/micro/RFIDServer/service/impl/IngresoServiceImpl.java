package com.micro.RFIDServer.service.impl;
import com.micro.RFIDServer.model.Ingreso;
import com.micro.RFIDServer.service.IngresoService;
import java.util.Optional;
import com.micro.RFIDServer.repository.IngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.micro.RFIDServer.service.impl.RfidArtifactServiceImpl;

@Service
public class IngresoServiceImpl implements IngresoService{
    @Autowired
    private IngresoRepository ingresoRepository;
    @Autowired
    private RfidArtifactServiceImpl rfidService;

    @Override
    public Ingreso createIngreso(Ingreso ingreso){

        ingreso.setFecha(java.time.LocalDate.now());
        ingreso.setHora(java.time.LocalTime.now());
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
    @Override
    public List<Ingreso> getAllIngreso(){
        return (List<Ingreso>) ingresoRepository.findAll();
    }

    @Override
    public Ingreso createIngresoWithRfid(String rfid_code){
        Ingreso ingreso = new Ingreso();
        int rfid_id = rfidService.rfidIsActivo(rfid_code);
        ingreso.setFecha(java.time.LocalDate.now());
        ingreso.setHora(java.time.LocalTime.now());
        ingreso.setRfid_id(rfid_id);
        return ingresoRepository.save(ingreso);
    }
}