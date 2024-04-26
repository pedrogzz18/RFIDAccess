package com.micro.RFIDServer.model;

import java.time.LocalDate;
import java.time.LocalTime;
import com.micro.RFIDServer.model.DashboardIngreso;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@NamedNativeQuery(name="Ingreso.getDashboardIngresos",
        query = ("SELECT i.id as id, i.fecha as fecha, i.hora as hora, " +
                "re.id as residente_id, re.nombre as residente_nombre, re.apellidos as residente_apellidos, " +
                "rf.id as rfid_id, rf.rfid_code as rfid_code FROM ingreso i " +
                "INNER JOIN rfid_artifact rf ON rf.id = i.rfid_id " +
                "INNER JOIN residente re ON rf.residente_id = re.id"),
        resultSetMapping="Mapping.DashboardIngreso")
@SqlResultSetMappings( {
        @SqlResultSetMapping(name="Mapping.DashboardIngreso",
        classes=@ConstructorResult(targetClass=DashboardIngreso.class,
                                    columns={@ColumnResult(name="id"),
                                            @ColumnResult(name="fecha", type=java.time.LocalDate.class),
                                            @ColumnResult(name="hora", type=java.time.LocalTime.class),
                                            @ColumnResult(name="residente_id"),
                                            @ColumnResult(name="residente_nombre"),
                                            @ColumnResult(name="residente_apellidos"),
                                            @ColumnResult(name="rfid_id"),
                                            @ColumnResult(name="rfid_code")
                }))
            }
        )

@Entity
@Table(name="ingreso")
public class Ingreso{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private int rfid_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getRfid_id() {
        return rfid_id;
    }

    public void setRfid_id(int rfid_id) {
        this.rfid_id = rfid_id;
    }
}