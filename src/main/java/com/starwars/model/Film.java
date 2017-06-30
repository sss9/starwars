package com.starwars.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"people","planets"})
public class Film {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private Long episodeId;
    @Column(length = 500)
    private String openingCrawl;
    private String director;
    private String producer;
    private Date releaseDate;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name = "film_id")},
    inverseJoinColumns = {@JoinColumn(name = "people_id")})
    private List<People> people;

    @ManyToMany
    @JoinTable(joinColumns = {@JoinColumn(name = "film_id")},
            inverseJoinColumns = {@JoinColumn(name = "planet_id")})
    private List<Planet> planets;


}
