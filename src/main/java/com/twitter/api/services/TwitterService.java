package com.twitter.api.services;

import org.springframework.stereotype.Service;
import twitter4j.Twitter;


public interface TwitterService {
    Twitter getTwitterInstance();
    /*public static Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(Constants.getEnv(Constants.CONSUMER_KEY))
                .setOAuthConsumerSecret(Constants.getEnv(Constants.CONSUMER_SECRET))
                .setOAuthAccessToken(Constants.getEnv(Constants.ACCESS_TOKEN))
                .setOAuthAccessTokenSecret(Constants.getEnv(Constants.ACCESS_TOKEN_SECRET));

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }*/
}
