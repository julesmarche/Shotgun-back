package com.app.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("EtatType")
public class EtatType {
     @Id
    public int id;
    public String type;
}
