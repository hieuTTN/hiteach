package com.hiteach.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "course")
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    private Integer maxQuantity;

    private Integer actived;

    private Integer deleted;

    private Date createdDate;

    private Double price;

    private String imageBanner;

    private String description;

    private Date startDate;

    private Date endDate;

    private Time startTime;

    private Time endTime;

    private String feedBackByAdmin;

    @ManyToOne
    @JoinColumn(name = "major_id")
    private Major major;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
