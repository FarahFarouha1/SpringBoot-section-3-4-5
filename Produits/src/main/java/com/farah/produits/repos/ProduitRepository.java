package com.farah.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farah.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
