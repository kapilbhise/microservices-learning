package com.example.StudentServiceApp.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "libraryTable")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name, address, email;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
