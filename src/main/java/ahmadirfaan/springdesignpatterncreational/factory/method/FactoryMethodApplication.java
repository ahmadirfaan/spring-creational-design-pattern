package ahmadirfaan.springdesignpatterncreational.factory.method;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FactoryMethodApplication.java, v 0.1 2022‐03‐10 23.05 Ahmad Irfaan Hibatullah Exp $$
 */

@SpringBootApplication
public class FactoryMethodApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type) {
        if(type == SocialMediaType.FACEBOOK) {
            return new FacebookV2SocialMedia();
        } else if (type == SocialMediaType.TIKTOK) {
            return new TiktokSocialMedia();
        } else if(type == SocialMediaType.TWITTER) {
            return new  TwitterSocialMedia();
        } else if (type == SocialMediaType.INSTAGRAM) {
            return new InstagramSocialMedia();
        } else {
            throw new IllegalArgumentException("Unsupported Social Media Type");
        }
    }
}