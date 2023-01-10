package com.kk.kkbackend.service;

import com.kk.kkbackend.model.Page;
import com.kk.kkbackend.repository.PageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PageService {
    private final PageRepository pageRepository;

    public List<Page> findAll() {
        return pageRepository.findAll();
    }


    public Page save(Page page) {
        return pageRepository.save(page);
    }

    public Page findById(Long id) {
        //return credLogRepository.findById(id).orElseGet(null);
        return pageRepository.findById(id).orElseThrow(() -> new RuntimeException("No data!"));

    }

    public void deleteById(Long id) {
        pageRepository.deleteById(id);
    }

}
