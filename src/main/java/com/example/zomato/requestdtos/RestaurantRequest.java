package com.example.zomato.requestdtos;

import com.example.zomato.enums.DietType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RestaurantRequest {

    @Pattern(regexp = "^[a-zA-Z0-9 .,&'-]{2,50}$",message = "Enter the Name in a Right Naming Format")
    @NotNull(message = "Restaurant Cannot be Null")
    @NotBlank(message = "Restaurant Cannot be Blank")
    private String name;

    @NotNull(message = "Description Cannot be Null")
    @NotBlank(message = "Restaurant Cannot be Blank")
    private String description;

    @Pattern(regexp = "^[6-9][0-9]{9}$",message = "Enter the Number in a Right Mobile Number Format")
    @NotNull(message = "Phone Number Cannot be Null")
    @NotBlank(message = "Phone Number Cannot be Blank")
    private String phoneNumber;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",message = "Enter the Email in a Right Email Format")
    @NotNull(message = "Email Cannot be Null")
    @NotBlank(message = "Email Cannot be Blank")
    private String email;

    private List<DietType> types;

}
