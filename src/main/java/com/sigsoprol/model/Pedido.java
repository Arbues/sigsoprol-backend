package com.sigsoprol.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.time.Instant;
import lombok.Builder;

@Data
@Entity
@Builder
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id")
    private Empleado empleado;

    @Column(name = "fechacreacion", updatable = false, insertable = false)
    private Instant fechacreacion;

    @Column(name = "updated_at", updatable = false, insertable = false)
    private Instant updatedAt;

    public Pedido() {
    }

    public Pedido(Long id, String estado, Empleado empleado, Instant fechacreacion, Instant updatedAt) {
        this.id = id;
        this.estado = estado;
        this.empleado = empleado;
        this.fechacreacion = fechacreacion;
        this.updatedAt = updatedAt;
    }

}
