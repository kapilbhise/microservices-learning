package com.example.LibraryServiceApp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookTable")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
    private int price;
}
