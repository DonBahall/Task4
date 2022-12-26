package com.example.task4.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@Component
@NoArgsConstructor
public class User {
    public String name;
    public String login;
    public String password;
}
