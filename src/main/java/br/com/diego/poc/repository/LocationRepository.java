package br.com.diego.poc.repository;

import br.com.diego.poc.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
