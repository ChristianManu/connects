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
public class job {

    @Id
    @GeneratedValue
    @Column(name = "job_id")
    private Integer job_id;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "description")
    private String description;

    @Column(name = "responsibilities")
    private String responsibilities;

    @Column(name = "yearsOfExperience")
    private Integer yearsOfExperience;

    @Column(name = "date_added")
    private Timestamp dateAdded;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Column(name = "active")
    private String active;
}
