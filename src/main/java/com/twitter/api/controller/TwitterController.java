package com.twitter.api.controller;

import com.twitter.api.model.TwitterFeaturesVo;
import com.twitter.api.model.TwitterVo;
import com.twitter.api.services.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.Status;
import twitter4j.Twitter;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TwitterController {
    @Autowired
    TwitterService twitterService;

    @GetMapping(value = "/v1/twitter")
    public ResponseEntity<List<TwitterVo>> find(){
        List<Status> statuses = null;
        List<TwitterVo> twiterLst = new ArrayList<>();

        Twitter twitter = twitterService.getTwitterInstance();

        try{
            statuses = twitter.getHomeTimeline();
            var twitterVo = new TwitterVo();
            twitterVo.setName(statuses.get(0).getUser().getName());
            twitterVo.setImage(statuses.get(0).getUser().getProfileImageURL());
            twitterVo.setDescription(statuses.get(0).getUser().getDescription());
            List<TwitterFeaturesVo> lstFeatures = new ArrayList<>();
            for (Status status : statuses) {
                var features = new TwitterFeaturesVo();
                features.setText(status.getText());
                features.setUrl("https://twitter.com/" + status.getUser().getScreenName() + "/status/"
                        + status.getId());
                lstFeatures.add(features);
            }
            twitterVo.setLstTwitter(lstFeatures);
            twiterLst.add(twitterVo);
            return new ResponseEntity<>(twiterLst, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(twiterLst, HttpStatus.CONFLICT);
        }
    }
}
