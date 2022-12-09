package com.lucas.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
