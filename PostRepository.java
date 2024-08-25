package com.portal.joblisting.repository;

import com.portal.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post,String> {

}
