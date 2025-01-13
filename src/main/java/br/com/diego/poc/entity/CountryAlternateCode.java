package br.com.diego.poc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CountryAlternateCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String codeType;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
