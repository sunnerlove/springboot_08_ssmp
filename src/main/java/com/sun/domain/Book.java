package com.sun.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Data
@NoArgsConstructor
public class Book  {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
