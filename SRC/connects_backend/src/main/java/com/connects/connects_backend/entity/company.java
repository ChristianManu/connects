package com.connects.connects_backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class company {
    @Id
    @GeneratedValue
    @Column(name = "company_id")
    private Integer company_id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private Integer address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date_added")
    private Timestamp dateAdded;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Column(name = "active")
    private String active;
}
