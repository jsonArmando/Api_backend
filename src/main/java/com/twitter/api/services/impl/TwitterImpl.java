package com.twitter.api.services.impl;

import com.twitter.api.services.TwitterService;
import com.twitter.api.utils.Constants;
import org.springframework.stereotype.Service;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Service
public class TwitterImpl implements TwitterService {
    @Override
    public Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(Constants.getEnv(Constants.CONSUMER_KEY))
                .setOAuthConsumerSecret(Constants.getEnv(Constants.CONSUMER_SECRET))
                .setOAuthAccessToken(Constants.getEnv(Constants.ACCESS_TOKEN))
                .setOAuthAccessTokenSecret(Constants.getEnv(Constants.ACCESS_TOKEN_SECRET));

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }
}
