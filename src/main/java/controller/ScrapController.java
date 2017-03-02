package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/scrap")
public class ScrapController {

    @RequestMapping(value = "/all-scraps")
    public String showAllScraps(){
        return "/scrap/all-scraps";
    }

    @RequestMapping(value = "/add-scrap")
    public String addScrap(){
        return "/scrap/add-scrap";
    }
}
