package br.com.diego.poc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class AlternateCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String codeType;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

}