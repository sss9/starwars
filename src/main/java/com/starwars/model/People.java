package com.starwars.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners({AuditingEntityListener.class})
public class People {
    @Id
    @GeneratedValue
    private Long peopleId;


    private String name;
    private String birthYear;
    private String eyeColor;
    private String gender;
    private String hairColor;
    private String height;
    private String mass;
    private String skinColor;
    private String homeworld;
    private String[] films;
    private String[] species;
    private String[] starships;
    private String[] vehicles;
    private String url;

    //@CreatedDate
    private LocalDateTime created;

    /*

    @EditedDate ToDo - No se llama exactamente asi
    */
    private LocalDateTime edited;



}
