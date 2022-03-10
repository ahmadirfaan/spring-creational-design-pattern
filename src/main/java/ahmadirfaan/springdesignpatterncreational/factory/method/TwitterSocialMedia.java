package ahmadirfaan.springdesignpatterncreational.factory.method;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: TwitterSocialMedia.java, v 0.1 2022‐03‐10 23.06 Ahmad Irfaan Hibatullah Exp $$
 */

@ToString
public class TwitterSocialMedia implements SocialMedia {

    @Getter
    private final String name = "TWITTER";

    @Getter
    private final
    String link = "https://twitter.com";

    @Getter
    private SocialMediaType socialMediaType = SocialMediaType.TWITTER;
}