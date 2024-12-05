package zawkin.me.kawori.service;

import zawkin.me.kawori.dto.company.CompanyCreateDTO;
import zawkin.me.kawori.dto.company.CompanyDTO;
import zawkin.me.kawori.entity.CompanyEntity;
import zawkin.me.kawori.enums.CompanyRole;
import zawkin.me.kawori.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyDTO create(CompanyCreateDTO dto) {
        if (companyRepository.existsByUsername(dto.getUsername())) {
            throw new RuntimeException("Username already exists!");
        }

        CompanyEntity entity = new CompanyEntity();
        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());
        entity.setContact(dto.getContact());
        entity.setRole(CompanyRole.valueOf(dto.getRole()));
        entity.setCode(dto.getCode());
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setCreatedDate(LocalDateTime.now());
        companyRepository.save(entity);

        return toDTO(entity);
    }

    public List<CompanyDTO> getAll() {
        return companyRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private CompanyDTO toDTO(CompanyEntity entity) {
        CompanyDTO dto = new CompanyDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAddress(entity.getAddress());
        dto.setContact(entity.getContact());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setVisible(entity.isVisible());
        dto.setRole(entity.getRole().name());
        dto.setCode(entity.getCode());
        dto.setUsername(entity.getUsername());
        return dto;
    }
}

