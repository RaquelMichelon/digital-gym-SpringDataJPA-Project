package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//optional annotation
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
