package com.blog.socialservice.repository;

import com.blog.socialservice.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikeRepository extends JpaRepository<Likes,Long> {

    Optional<Likes> findByIdUserIdAndIdCommentId(Long userId, Long commentId);
}
