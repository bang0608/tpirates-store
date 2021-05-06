package com.tpirates.store.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tpirates.store.dto.StoreSaveRequestDto;
import com.tpirates.store.service.StoreService;

@RestController
public class StoreApiController {
	
	private static final Logger logger = LoggerFactory.getLogger(StoreApiController.class);
	
	@Autowired
	private StoreService storeService;
	
	@PostMapping(value="/api/v1/stores")
    public Long save(@RequestBody StoreSaveRequestDto storeSaveRequestDto){
		logger.info("dto.name === " + storeSaveRequestDto.getName());
		logger.info("dto.owner === " + storeSaveRequestDto.getOwner());
		logger.info("dto.address === " + storeSaveRequestDto.getAddress());
		return storeService.save(storeSaveRequestDto);
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
