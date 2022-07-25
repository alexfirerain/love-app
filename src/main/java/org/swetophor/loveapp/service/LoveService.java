package org.swetophor.loveapp.service;

import org.springframework.stereotype.Service;
import org.swetophor.loveapp.model.LoveRequest;
import org.swetophor.loveapp.model.LoveResponse;

@Service
public class LoveService {

    public LoveResponse loveBack(LoveRequest loveRequest) {
        return new LoveResponse(loveRequest.getId(),
                loveRequest.getMessage() + " too");
    }
}
