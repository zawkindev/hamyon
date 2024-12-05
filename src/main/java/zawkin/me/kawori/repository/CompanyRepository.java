package zawkin.me.kawori.repository;

import zawkin.me.kawori.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, String> {
    boolean existsByUsername(String username);
}

