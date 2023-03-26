package com.waa.labtwo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component //I have created an Exception object in ExecutionTimeAspect class
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Exception extends Logger{
    private String exceptionType;
}
