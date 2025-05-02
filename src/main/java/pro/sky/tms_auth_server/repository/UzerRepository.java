package pro.sky.tms_auth_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.tms_auth_server.entity.UzerEntity;

import java.util.Optional;

public interface UzerRepository extends JpaRepository<UzerEntity, Long> {

    Optional<UzerEntity> findByEmail(String email);

}
