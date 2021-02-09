package com.sherry.ratingsdataservice.resource;

import com.sherry.ratingsdataservice.data.Rating;

import com.sherry.ratingsdataservice.data.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsData")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId , 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        UserRating userRating = new UserRating();
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("1235", 3)
        );
        userRating.setUserRatings(ratings);
        return userRating;
    }
}
