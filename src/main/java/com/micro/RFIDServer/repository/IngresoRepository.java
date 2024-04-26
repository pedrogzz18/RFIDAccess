package com.micro.RFIDServer.repository;
import com.micro.RFIDServer.model.Ingreso;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import com.micro.RFIDServer.model.DashboardIngreso;
import java.util.List;
@Repository
public interface IngresoRepository extends CrudRepository<Ingreso, Integer>{
    @Query(nativeQuery = true)
    List<DashboardIngreso> getDashboardIngresos();
}