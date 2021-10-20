package com.akifsonmez.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@Document // mongo is a document-oriented
public class User {

    @Id
    private String id;

    private String name;

    private String surname;

    private HashMap<String, String> properties;

}
