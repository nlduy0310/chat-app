package com.nlduy0310.chat_app_backend.dto;

import com.nlduy0310.chat_app_backend.config.ValidationProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class CreateUserRequestDto {
    // TODO make validation messages constant
    // TODO trim before validating
    // TODO disable mismatch type conversion before validating
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email address")
    @Pattern(regexp = ValidationProperties.EMAIL_REGEX, message = "Invalid email format")
    private final String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 32, message = "Password's length must be between 8 and 32")
    @Pattern(regexp = ValidationProperties.CONTAIN_DIGIT_REGEX, message = "Password must contain at least one digit")
    @Pattern(regexp = ValidationProperties.CONTAIN_LOWERCASE_REGEX, message = "Password must contain at least one lowercase charater")
    @Pattern(regexp = ValidationProperties.CONTAIN_UPPERCASE_REGEX, message = "Password must contain at least one uppercase character")
    @Pattern(regexp = ValidationProperties.PASSWORD_CHARACTERS_REGEX, message = "Password can only contain Latin characters, space(s), and the following: !@#+-_~=.,")
    private final String password;

    @NotBlank(message = "Full name is required")
    @Size(min = 4, max = 20, message = "Full name's length must be between 4 and 20")
    @Pattern(regexp = ValidationProperties.FULL_NAME_CHARACTERS_REGEX, message = "Full name can only contain Latin characters and space(s)")
    private final String fullName;
}
