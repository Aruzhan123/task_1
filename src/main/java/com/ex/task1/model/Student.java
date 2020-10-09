package com.ex.task1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private String phone;
    private long groupid;


    @Override
    public String toString() {
        return super.toString();
    }
}
