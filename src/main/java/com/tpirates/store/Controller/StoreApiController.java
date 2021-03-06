package com.tpirates.store.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tpirates.store.dto.StoreSaveRequestDto;
import com.tpirates.store.service.StoreService;

@RestController
public class StoreApiController {
	
	private static final Logger logger = LoggerFactory.getLogger(StoreApiController.class);
	
	@Autowired
	private StoreService storeService;
	
	@PostMapping(value="/api/v1/stores", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody StoreSaveRequestDto storeSaveRequestDto) {
		logger.info("dto.name === " + storeSaveRequestDto.getName());
		logger.info("dto.owner === " + storeSaveRequestDto.getOwner());
		logger.info("dto.address === " + storeSaveRequestDto.getAddress());
		logger.info("dto.level === " + storeSaveRequestDto.getLevel());
		logger.info("dto.phone === " + storeSaveRequestDto.getPhone());
		logger.info("dto.description === " + storeSaveRequestDto.getDescription());
		
		storeService.save(storeSaveRequestDto);
    }
	
//    @GetMapping("/api/v1/posts/{id}")
//    public PostsResponseDto findById(@PathVariable Long id) {
//        return postsService.findById(id);
//    }
//
//    @PutMapping("/api/v1/posts/{id}")
//    public Long update(@PathVariable Long id, @RequestBody PostsSaveRequestDto postsSaveRequestDto) {
//        return postsService.update(id, postsSaveRequestDto);
//    }
//
//    @DeleteMapping("/api/v1/posts/{id}")
//    public Long delete(@PathVariable Long id) {
//        postsService.delete(id);
//        return id;
//    }
//
//    @GetMapping("/api/v1/posts/list")
//    public List<PostsListResponseDto> findAll() {
//        return postsService.findAllDesc();
//    }

}
