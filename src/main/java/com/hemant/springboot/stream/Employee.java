package com.hemant.springboot.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    private String name;
    private Long id;
    private Long salary;
    List<String> skills;


}
