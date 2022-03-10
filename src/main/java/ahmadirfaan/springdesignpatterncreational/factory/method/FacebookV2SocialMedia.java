package ahmadirfaan.springdesignpatterncreational.factory.method;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FacebookV2SocialMedia.java, v 0.1 2022‐03‐10 23.06 Ahmad Irfaan Hibatullah Exp $$
 */

@ToString
public class FacebookV2SocialMedia implements SocialMedia {

    @Getter
    private final String name = "FACEBOOK";

    @Getter
    private final
    String link = "https://facebook.com";

    @Getter
    private SocialMediaType socialMediaType = SocialMediaType.FACEBOOK;
}