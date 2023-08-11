package edu.miu.swe.eregistrar.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotNull
    private String studentNumber;

    @NotNull
    private String firstName;

    private String middleName;

    @NotNull
    private String lastName;

    private Float cgpa;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enrollmentDate;

    @NotNull
    private Boolean isInternational;

}
