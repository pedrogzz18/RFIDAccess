package com.micro.RFIDServer.repository;
import com.micro.RFIDServer.model.RfidArtifact;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

@Repository
public interface RfidArtifactRepository extends CrudRepository<RfidArtifact, Integer>{
    @Query("SELECT e FROM RfidArtifact e WHERE e.rfid_code = ?1")
    Optional<RfidArtifact> findRfidArtifactByRfid(String rfid_code);
}