package com.tweteroo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SignUpDTO(@NotBlank String username, @NotNull String avatar) {
    
}
