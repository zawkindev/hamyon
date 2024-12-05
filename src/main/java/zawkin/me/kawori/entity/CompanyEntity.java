package zawkin.me.kawori.entity;

import jakarta.persistence.*;
import lombok.Data;
import zawkin.me.kawori.enums.CompanyRole;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "company")
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String contact;

    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private boolean visible = true;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CompanyRole role;

    @Column(nullable = true, unique = true)
    private String code;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;
}
