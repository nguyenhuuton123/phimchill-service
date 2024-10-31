package com.codegym.phimchill.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RegisterDto {
    private Long id;
    private String email;
    private String name;
}
