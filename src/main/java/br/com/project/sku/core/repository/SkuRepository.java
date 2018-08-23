package br.com.project.sku.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.sku.core.entity.Sku;

public interface SkuRepository extends JpaRepository<Sku, Long>{
	
	
}
