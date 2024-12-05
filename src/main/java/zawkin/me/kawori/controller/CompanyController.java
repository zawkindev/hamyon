package zawkin.me.kawori.controller;

import zawkin.me.kawori.dto.company.CompanyCreateDTO;
import zawkin.me.kawori.dto.company.CompanyDTO;
import zawkin.me.kawori.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<CompanyDTO> create(@RequestBody CompanyCreateDTO dto) {
        return ResponseEntity.ok(companyService.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<CompanyDTO>> getAll() {
        return ResponseEntity.ok(companyService.getAll());
    }
}

