package com.onlinestore.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "ok_products")
public class OkProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "url", nullable = false)
    private String url;

    @ColumnDefault("0")
    @Column(name = "brand_id")
    private Integer brandId;

    @Size(max = 512)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "name", nullable = false, length = 512)
    private String name;

    @Lob
    @Column(name = "annotation")
    private String annotation;

    @Lob
    @Column(name = "description")
    private String description;

    @NotNull
    @ColumnDefault("1")
    @Column(name = "visible", nullable = false)
    private Boolean visible = false;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "position", nullable = false)
    private Integer position;

    @Size(max = 512)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "meta_title", nullable = false, length = 512)
    private String metaTitle;

    @Size(max = 512)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "meta_keywords", nullable = false, length = 512)
    private String metaKeywords;

    @Size(max = 512)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "meta_description", nullable = false, length = 512)
    private String metaDescription;

    @Column(name = "created")
    private Instant created;

    @ColumnDefault("0")
    @Column(name = "featured")
    private Boolean featured;

    @Size(max = 36)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "external_id", nullable = false, length = 36)
    private String externalId;

    @ColumnDefault("0.0")
    @Column(name = "rating")
    private Float rating;

    @ColumnDefault("0")
    @Column(name = "votes")
    private Integer votes;

    @Size(max = 255)
    @ColumnDefault("''")
    @Column(name = "special")
    private String special;

    @NotNull
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "last_modify", nullable = false)
    private Instant lastModify;

    @Column(name = "main_category_id")
    private Integer mainCategoryId;

    @Column(name = "main_image_id")
    private Integer mainImageId;

}