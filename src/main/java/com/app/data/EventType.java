package com.app.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("EventType")
public class EventType {
     @Id
    public int id;
    public String type;
}
