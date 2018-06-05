package com.example.photoeditorbe.repositories;

import com.example.photoeditorbe.models.Picture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PictureRepository extends CrudRepository<Picture, Long> {
}
