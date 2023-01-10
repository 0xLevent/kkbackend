package com.kk.kkbackend.controller;

import com.kk.kkbackend.model.Page;
import com.kk.kkbackend.service.PageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/page")

public class PageController {
    //save delete findbyid
    private final PageService pageService;



    @GetMapping("/findById/{id}")
    public Page findById(@PathVariable Long id) {
        return pageService.findById(id);
    }

    @PostMapping("/save")   //getBody eklemeyince hata veriyor
    public ResponseEntity<Page> save(@RequestBody Page page) {
        Page savedObject = pageService.save(page);
        return ResponseEntity.ok(savedObject);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        pageService.deleteById(id);
    }

}
