package com.example.photoeditorbe.controllers;


import com.example.photoeditorbe.models.Picture;
import com.example.photoeditorbe.repositories.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PicturesController {

    @Autowired
    private PictureRepository pictureRepository;

    @GetMapping("/pictures")
    public Iterable<Picture> findAllUsers() {
        return pictureRepository.findAll();
    }

    @GetMapping("/pictures/{pictureId}")
    public Picture getPictureById(@PathVariable Long pictureId) {
        return pictureRepository.findById(pictureId).get();
    }

    @PostMapping("/pictures")
    public Picture createNewUser(@RequestBody Picture newPicture) {
        return pictureRepository.save(newPicture);
    }
    @DeleteMapping("/pictures/{pictureId}")
    public HttpStatus deletePictureById(@PathVariable Long pictureId) {
        pictureRepository.deleteById(pictureId);
        return HttpStatus.OK;
    }
}
