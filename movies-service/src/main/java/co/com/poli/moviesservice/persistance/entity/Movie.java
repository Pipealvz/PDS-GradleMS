package co.com.poli.moviesservice.persistance.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotEmpty(message = "El titulo no empty")
    @Column(name = "title")
    private String title;

    @NotEmpty(message = "El director no empty")
    @Column(name = "director")
    private String director;

    @Min(value = 1, message = "El rating between 1 a 5")
    @Max(value = 5, message = "El rating between 1 a 5")
    @Column(name = "rating")
    private int rating;

}
