package com.micro.RFIDServer.service;
import com.micro.RFIDServer.model.RfidArtifact;
import java.util.Optional;

public interface RfidArtifactService{
    public RfidArtifact createRfidArtifact(RfidArtifact rfid_artifact);

    public RfidArtifact updateRfidArtifactById(RfidArtifact new_rfid_artifact, int id);

    public void deleteRfidArtifactById(int id);

    public Optional<RfidArtifact> getRfidArtifactById(int id);

    public int rfidIsActivo(String rfid_code);
}