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
    private String name;
    private String locationId;
    private String status;
    private String bdaType;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String geoType;
    private LocalDate validTo;
    private String hsudName;
    private BigDecimal latitude;
    private Boolean portFlag;
    private String timeZone;
    private BigDecimal longitude;
    private LocalDate validFrom;
    private Boolean restricted;
    private String description;
    private String dialingCode;
    private Boolean isMaerskCity;
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
    private List<BdaLocation> bdas;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<LocationAlternateCode> alternateCodes;

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", locationId='" + locationId + '\'' +
                ", status='" +status+ '\'' +
                ", bdaType='" + bdaType + '\'' +
                '}';
    }
}