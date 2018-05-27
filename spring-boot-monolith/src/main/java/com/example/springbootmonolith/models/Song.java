package com.example.springbootmonolith.models;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "SONGS")
public class Song {

    public Song(String title, Integer length) {
        this.title = title;
        this.length = length;
//        this.lastName = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "LENGTH")
    private Integer length;

//    @Column(name = "FIRST_NAME")
//    private String firstName;
//
//    @Column(name = "LAST_NAME")
//    private String lastName;

}
