package com.example.photoeditorbe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "PICTURES")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "PICTURE_URL")
    private String pictureUrl;

    @Column(name = "GRAYSCALE")
    private String grayscale;

    @Column(name = "SATURATE")
    private String saturate;

    @Column(name = "BLUR")
    private String blur;

    @Column(name = "SEPIA")
    private String sepia;

    @Column(name = "HUEROTATE")
    private String hueRotate;

    @Column(name = "BRIGHTNESS")
    private String brightness;

    @Column(name = "CONTRAST")
    private String contrast;

    @Column(name = "INVERT")
    private String invert;

    @Column(name = "OPACITY")
    private String opacity;


}


