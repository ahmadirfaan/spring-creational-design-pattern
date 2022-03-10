package ahmadirfaan.springdesignpatterncreational.factory.inheritance;

import ahmadirfaan.springdesignpatterncreational.factory.method.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FactoryInheritanceApplication.java, v 0.1 2022‐03‐10 23.27 Ahmad Irfaan Hibatullah Exp $$
 */

@SpringBootApplication
public class FactoryInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook() {
        return new FacebookV2SocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram() {
        return new InstagramSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTiktok() {
        return new TiktokSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter() {
        return new TwitterSocialMedia();
    }
}