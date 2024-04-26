package com.micro.RFIDServer.service.impl;
import com.micro.RFIDServer.model.RfidArtifact;
import com.micro.RFIDServer.service.RfidArtifactService;
import java.util.Optional;
import java.util.List;
import com.micro.RFIDServer.repository.RfidArtifactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RfidArtifactServiceImpl implements RfidArtifactService{
    @Autowired
    private RfidArtifactRepository rfidArtifactRepository;

    @Override
    public RfidArtifact createRfidArtifact(RfidArtifact rfid_artifact){

        rfid_artifact.setActivo(true);
        return rfidArtifactRepository.save(rfid_artifact);

    }

    @Override
    public RfidArtifact updateRfidArtifactById(RfidArtifact new_rfid_artifact, int id){
        return rfidArtifactRepository.save(new_rfid_artifact);
    }

    @Override
    public void deleteRfidArtifactById(int id){
        rfidArtifactRepository.deleteById(id);
    }

    @Override
    public Optional<RfidArtifact> getRfidArtifactById(int id){
        return rfidArtifactRepository.findById(id);
    }

    @Override
    public int rfidIsActivo(String rfid_code){
        Optional<RfidArtifact> rfid = rfidArtifactRepository.findRfidArtifactByRfid(rfid_code);
        if(rfid != null){
            return rfid.get().getId();
        }
        return 0;
    }

    @Override
    public List<RfidArtifact> getRfids(){
        return (List<RfidArtifact>)rfidArtifactRepository.findAll();
    }
}