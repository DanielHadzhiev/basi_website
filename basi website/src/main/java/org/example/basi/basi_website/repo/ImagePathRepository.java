package org.example.basi.basi_website.repo;

import org.example.basi.basi_website.model.entity.ImagePath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagePathRepository extends JpaRepository<ImagePath,Integer> {
}
