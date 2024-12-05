package zawkin.me.kawori.dto.company;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CompanyDTO {
    private String id;
    private String name;
    private String address;
    private String contact;
    private LocalDateTime createdDate;
    private boolean visible;
    private String role;
    private String code;
    private String username;
}

