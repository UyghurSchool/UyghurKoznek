package com.uyghurbiz.core;

import com.uyghurbiz.service.TwitterFavoriteServicesImpl;
import com.uyghurbiz.service.TwitterTimelineResourcesServicesImpl;
import com.uyghurbiz.service.TwitterUserResourcesServicesImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Yari_Dev on 10/12/15.
 */
@Configuration("twitterServiceConfig")
@Import(TwitterConfig.class)
public class TwitterServiceConfig {

    /**
     * Test tiwtter user services
     *
     * @return
     */
//    @Bean
//    public TwitterUserResourcesServicesImpl twitterUserResourcesService() {
//        return new TwitterUserResourcesServicesImpl();
//    }
//
//    @Bean
//    public TwitterFavoriteServicesImpl twitterFavoriteService(){
//        return new TwitterFavoriteServicesImpl();
//    }
//    @Bean
//    public TwitterTimelineResourcesServicesImpl twitterTimelineResourcesService(){
//        return new TwitterTimelineResourcesServicesImpl();
//    }
}
