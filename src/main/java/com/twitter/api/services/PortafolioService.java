package com.twitter.api.services;

import com.twitter.api.model.PortafolioVo;
import com.twitter.api.repository.TwitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PortafolioService {
    @Autowired
    TwitterRepository twitterRepository;

    public List<PortafolioVo> getPortafolio() {
        List<PortafolioVo> portafolio = new ArrayList<PortafolioVo>();
        twitterRepository.findAll().forEach(x -> portafolio.add(x));
        return portafolio;
    }

    public PortafolioVo getPortafolioById(int id) {
        return twitterRepository.findById(id).get();
    }

    public void save(PortafolioVo portafolio) {
        twitterRepository.save(portafolio);
    }
}
