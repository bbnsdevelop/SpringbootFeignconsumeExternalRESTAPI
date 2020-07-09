package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.feign.dto.PexelsResponse;

@FeignClient(name = "data", url = "${pexel.search.uri}")
public interface PexelsClient {

    // for fetching images page by page. refer https://www.pexels.com/api/documentation/
    @RequestMapping(method = RequestMethod.GET)
    PexelsResponse getPhotos(@RequestParam("query") String query,
                       @RequestParam("per_page") int perPage,
                       @RequestParam("page") int page);

    // for fetching images for a topic. refer https://www.pexels.com/api/documentation/
    @RequestMapping(method = RequestMethod.GET)
    PexelsResponse getPhotos(@RequestParam("per_page") int perPage,
                             @RequestParam("page") int page);
}
