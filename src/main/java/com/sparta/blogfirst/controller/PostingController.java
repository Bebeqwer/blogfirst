package com.sparta.blogfirst.controller;

import com.sparta.blogfirst.dto.PostingRequestDto;
import com.sparta.blogfirst.dto.PostingResponseDto;
import com.sparta.blogfirst.service.PostingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostingController {

    private final PostingService postingService;

    public PostingController(PostingService postingService) {
        this.postingService = postingService;
    }

    @PostMapping("/postings")
    public PostingResponseDto createPosting(@RequestBody PostingRequestDto requestDto) {

        return postingService.createPosting(requestDto);
    }

    @GetMapping("/postings")
    public List<PostingResponseDto> getPostings() {
        return postingService.getPostings();
    }

    @GetMapping("/postings/{id}")
    public PostingResponseDto findPost(@PathVariable Long id){

        return postingService.getPosting(id);
    }

    @PutMapping("/postings/{id}")
    public PostingResponseDto updateMemo(@PathVariable Long id, @RequestBody PostingRequestDto requestDto) {

        return postingService.updatePosting(id,requestDto);

    }


    @DeleteMapping("/postings/{id}")
    public boolean deleteMemo(@PathVariable Long id, @RequestBody PostingRequestDto requestDto) {

        return postingService.deletePosting(id, requestDto);

        // 해당 메모가 DB에 존재하는지 확인

    }


}
