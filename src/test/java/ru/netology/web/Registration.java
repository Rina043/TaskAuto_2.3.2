package ru.netology.web;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {
    private String login;
    private String password;
    private String status;

    public Registration(String login, String password, String active) {
    }
}
