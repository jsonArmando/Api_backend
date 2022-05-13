package com.twitter.api.controller;

import com.twitter.api.model.PortafolioVo;
import com.twitter.api.model.TwitterFeaturesVo;
import com.twitter.api.model.TwitterVo;
import com.twitter.api.services.PortafolioService;
import com.twitter.api.services.TwitterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import twitter4j.Status;
import twitter4j.Twitter;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/v1")
public class TwitterController {

    private static final Logger log = LogManager.getLogger(TwitterController.class);

    @Autowired
    TwitterService twitterService;

    @Autowired
    PortafolioService portafolioService;

    @GetMapping(value = "/twitter")
    public ResponseEntity<List<TwitterVo>> find(){
        List<Status> statuses = null;
        Twitter twitter = twitterService.getTwitterInstance();
        List<TwitterVo> lst = new ArrayList<>();
        var twitterVo = new TwitterVo();
        try{
            statuses = twitter.getHomeTimeline();
            twitterVo.setName(statuses.get(0).getUser().getName());
            twitterVo.setImage(statuses.get(0).getUser().getProfileImageURL());
            twitterVo.setDescription(statuses.get(0).getUser().getDescription());
            List<TwitterFeaturesVo> lstFeatures = new ArrayList<>();
            int cont =0;
            for (Status status : statuses) {
                var features = new TwitterFeaturesVo();
                features.setText(status.getText());
                features.setUrl("https://twitter.com/" + status.getUser().getScreenName() + "/status/"
                        + status.getId());
                lstFeatures.add(features);
                cont +=1;
                if(cont==5)
                    break;
            }
            twitterVo.setLstTwitter(lstFeatures);
            lst.add(twitterVo);
            return new ResponseEntity<>(lst, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(lst, HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/get")
    private ResponseEntity<List<PortafolioVo>> getPortafolios() {
        return ResponseEntity.ok(portafolioService.getPortafolio());
    }

    @GetMapping("/get/{id}")
    private ResponseEntity<PortafolioVo> getPortafolio(@PathVariable("id") int id){
        return ResponseEntity.ok(portafolioService.getPortafolioById(id));
    }

    @PostMapping("/save")
    private ResponseEntity<PortafolioVo> save(@RequestBody PortafolioVo portafolio) {
        try{
            portafolioService.save(portafolio);
        }catch (Exception e){
            log.error("No se pudo guardar el portafolio" + e);
        }
        return new ResponseEntity("Se ha guardado correctamente", HttpStatus.OK);
    }

    @PutMapping("/update")
    private ResponseEntity<PortafolioVo> update(@RequestBody PortafolioVo portafolio) {
        try{
            Integer s = null;
            try { s = Integer.valueOf(portafolio.getIdportfolio());
            } catch (NumberFormatException e) {
                log.error("Error al realizar validación" +e);
            }
            if(s!=null)
                portafolioService.save(portafolio);
            else
                log.error("No se pudo actualizar el portafolio, no registra ID");
        }catch (Exception e){
            log.error("No se pudo guardar el portafolio: " + e);
        }
        return new ResponseEntity("Se ha actualizado correctamente", HttpStatus.OK);
    }
}
