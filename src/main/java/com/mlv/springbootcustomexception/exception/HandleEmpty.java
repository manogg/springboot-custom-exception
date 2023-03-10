package com.mlv.springbootcustomexception.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HandleEmpty extends RuntimeException{

    private String errorMessage;
}
