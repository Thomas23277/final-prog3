package com.foodstore.htmeleros.entity;

<<<<<<< HEAD
import jakarta.persistence.*;
=======

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
>>>>>>> 221a344b61261b9c45cf27d9e8eb17ea09439bf8
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "productos")
<<<<<<< HEAD
public class Producto {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(unique = true, nullable = false)
 private String nombre;

 @Column(nullable = false)
 private Double precio;

 @Column(nullable = false)
 private Integer stock;
=======

public class Producto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(unique = true, nullable = false)
 private String nombre;
 @Column(nullable = false)
 private Double precio;
 @Column(nullable = false)
private Integer stock;
>>>>>>> 221a344b61261b9c45cf27d9e8eb17ea09439bf8

 @ManyToOne
 @JoinColumn(name = "categoria_id", nullable = false)
 private Categoria categoria;
<<<<<<< HEAD

 // 🔹 Campo calculado (no se guarda en la BD)
 @Transient
 private boolean disponible;

 // 🔹 Getter personalizado: se calcula dinámicamente según el stock
 public boolean isDisponible() {
  return this.stock != null && this.stock > 0;
 }
}
=======
}
>>>>>>> 221a344b61261b9c45cf27d9e8eb17ea09439bf8
