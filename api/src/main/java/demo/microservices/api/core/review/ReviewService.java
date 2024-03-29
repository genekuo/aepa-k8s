package demo.microservices.api.core.review;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

public interface ReviewService {

    Review createReview(@RequestBody Review body);

    /**
     * Sample usage: curl $HOST:$PORT/review?productId=1
     *
     * @param productId
     * @return
     */
    @GetMapping(
        value    = "/review",
        produces = "application/json")
    Flux<Review> getReviews(@RequestHeader HttpHeaders headers, @RequestParam(value = "productId", required = true) int productId);

    void deleteReviews(@RequestParam(value = "productId", required = true) int productId);
}