package com.ex.task1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Group {
    @Id
    private long id;
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }
}