package com.twitter.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Twitter;

public interface TwitterService {
    Twitter getTwitterInstance();

}
