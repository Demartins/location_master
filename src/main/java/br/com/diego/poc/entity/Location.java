package br.com.diego.poc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bdas;
    private String name;
    private String locationId;
    private String status;
    private String bdaType;
    private String country;
    private String geoType;
    private LocalDate validTo;
    private String huluName;
    private BigDecimal latitude;
    private Boolean portFlag;
    private String timeZone;
    private BigDecimal longitude;
    private LocalDate validFrom;
    private Boolean restricted;
    private String description;
    private String dialingCode;
    private Boolean isDuskCity;
    private String olsonTimezone;
    private Integer utcOffsetMinutes;
    private String workaroundReason;
    private LocalDate daylightSavingEnd;
    private LocalTime daylightSavingTime;
    private LocalDate daylightSavingStart;
    private Boolean postalCodeMandatory;
    private String dialingCodeDescription;
    private Boolean stateProvinceMandatory;
    private Integer daylightSavingShiftMinutes;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Parent> parents;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<BdaLocation> bdaLocations;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<LocationAlternateCode> alternateCodes;

    // Getters and Setters
}