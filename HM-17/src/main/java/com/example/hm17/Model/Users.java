package com.example.hm17.Model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Users {
    @NotNull(message = "Cannot be null")
    private Integer id;
   @NotEmpty(message = "Cannot be null")
   @Column(columnDefinition = "varchar(4) not null")
   private String name;
   @NotEmpty(message = "Cannot be null")
   @Column(columnDefinition = "varchar(4) not null")
   private String username;
   @NotNull(message = "Cannot be null")
    private Integer password;
   @NotEmpty(message ="Cannot be null" )
   @Email
   private String email;
   @NotNull(message = "Cannot be null")
   private Integer role;
   @NotNull(message = "Cannot be null")
   private Integer age;

}
