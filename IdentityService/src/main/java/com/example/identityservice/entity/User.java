package com.example.identityservice.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Auditable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel{

}
