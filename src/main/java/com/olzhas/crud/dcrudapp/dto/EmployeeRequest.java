package com.olzhas.crud.dcrudapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class EmployeeRequest {

    @NotBlank(message = "Имя обязательно")
    private String firstName;

    @NotBlank(message = "Фамилия обязательна")
    private String lastName;

    @Email(message = "Некорректный email")
    private String email;

    @NotBlank(message = "Должность обязательна")
    private String position;

    @Positive(message = "Зарплата должна быть положительным числом")
    private Double salary;
}
