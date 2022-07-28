package org.swetophor.loveapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.swetophor.loveapp.model.LoveRequest;
import org.swetophor.loveapp.model.LoveResponse;
import org.swetophor.loveapp.service.LoveService;

@RestController
public class LoveController {
    private final LoveService loveService;

    public LoveController(LoveService loveService) {
        this.loveService = loveService;
    }

    @PostMapping("/love")
    public LoveResponse loveBack(@RequestBody LoveRequest loveRequest) {
        return loveService.loveBack(loveRequest);
    }
    @PostMapping("/plainlove")
    public String loveJustBack(String loveRequest) {
        System.out.println(loveRequest);
        return loveRequest;
    }
}
