package zawkin.me.kawori.dto.company;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyCreateDTO {
    private String name;
    private String address;
    private String contact;
    private String role;
    private String code;
    private String username;
    private String password;
}

