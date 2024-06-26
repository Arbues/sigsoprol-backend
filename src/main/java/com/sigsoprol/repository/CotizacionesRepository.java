package com.sigsoprol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sigsoprol.model.Cotizaciones;

@Repository
public interface CotizacionesRepository extends JpaRepository<Cotizaciones, Long>{
}
