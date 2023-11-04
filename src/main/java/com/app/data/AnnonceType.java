package com.app.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("AnnonceType")
public class AnnonceType {
     @Id
    public int id;
    public String type;
}
