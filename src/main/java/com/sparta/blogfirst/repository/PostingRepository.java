package com.sparta.blogfirst.repository;

import com.sparta.blogfirst.dto.PostingResponseDto;
import com.sparta.blogfirst.entity.Posting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostingRepository extends JpaRepository<Posting,Long> {

    List<Posting> findAllByOrderByCreatedAtDesc();

}
