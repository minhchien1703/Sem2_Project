package com.sem2.sem2_project.valid;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ValidationException extends RuntimeException {
    private List<ValidationError> errors;
}
