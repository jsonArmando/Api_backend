package com.twitter.api;

import com.twitter.api.services.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import twitter4j.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	/*public static void main(String[] args) throws IOException, TwitterException {
		List<Status> statuses = null;
		Twitter twitter = twitterService.getTwitterInstance();
		try {
			statuses = twitter.getHomeTimeline();
			System.out.println("Showing home timeline.");
			for (Status status : statuses) {
				System.out.println(status.getUser().getName() + ":" + status.getText());
				String url = "https://twitter.com/" + status.getUser().getScreenName() + "/status/"
						+ status.getId();
				System.out.println("Above tweet URL : " + url);
			}
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}*/
}
