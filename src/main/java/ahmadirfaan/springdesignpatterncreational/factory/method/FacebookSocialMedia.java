package ahmadirfaan.springdesignpatterncreational.factory.method;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FacebookSocialMedia.java, v 0.1 2022‐03‐10 23.06 Ahmad Irfaan Hibatullah Exp $$
 */

@Deprecated
@ToString
public class FacebookSocialMedia implements SocialMedia {

    @Getter
    private final String name = "FACEBOOK";

    @Getter
    private final
    String link = "https://facebook.com";

    @Getter
    private SocialMediaType socialMediaType = SocialMediaType.FACEBOOK;
}