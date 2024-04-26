package com.micro.RFIDServer.controller;
import com.micro.RFIDServer.model.RfidArtifact;
import com.micro.RFIDServer.service.impl.RfidArtifactServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@RestController
public class RfidApi{
    @Autowired private RfidArtifactServiceImpl rfidArtifactService;

    @PostMapping("/rfid")
    public RfidArtifact createRfidArtifact(@RequestBody RfidArtifact rfid_artifact)
    {
        return rfidArtifactService.createRfidArtifact(rfid_artifact);
    }

    @GetMapping("/rfid/{id}")
    public Optional<RfidArtifact> getRfidArtifactById(@PathVariable("id") int id)
    {
        return rfidArtifactService.getRfidArtifactById(id);
    }

    @PutMapping("/rfid/{id}")
    public RfidArtifact updateRfidArtifactById(@RequestBody RfidArtifact rfid_artifact,
                                                 @PathVariable("id") int id)
    {
        return rfidArtifactService.updateRfidArtifactById(rfid_artifact, id);
    }

    @DeleteMapping("/rfid/{id}")
    public String deleteRfidArtifactById(@PathVariable("id") int id) {
        rfidArtifactService.deleteRfidArtifactById(id);
        return "Deleted Successfully";
    }

    @GetMapping("/rfid_code")
    public int getRfidArtifactById(@PathVariable("rfid_code") String code)
    {
        return rfidArtifactService.rfidIsActivo(code);
    }
}