package com.manycode.app.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;



@Data
@EqualsAndHashCode
@Entity
public class Car implements Serializable{


    private static final long serialVersionUID = 1L;
    @Id
    @Column (name = "ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    @Column(nullable=false)
    private String manufacturer;
    
    @NotNull
    @Column(nullable=false)
    private String model;
    
    @NotNull
    @Column(nullable=false)
    private String type;	
	
}
