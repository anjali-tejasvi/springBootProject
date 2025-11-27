package com.fitness.activityservice.repo;

import com.fitness.activityservice.modal.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActivityRepository  extends MongoRepository<Activity , String> {
}
