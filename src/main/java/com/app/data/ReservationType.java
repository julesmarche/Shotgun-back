package com.app.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("ReservationType")
public class ReservationType {
     @Id
    public int id;
    public String type;
}
