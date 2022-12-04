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
public class recruiter {
    @Id
    @GeneratedValue
    @Column(name = "recruiter_id")
    private Integer recruiter_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "office_phone_number")
    private Integer officePhoneNumber;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "date_added")
    private Timestamp dateAdded;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Column(name = "active")
    private String active;
}
