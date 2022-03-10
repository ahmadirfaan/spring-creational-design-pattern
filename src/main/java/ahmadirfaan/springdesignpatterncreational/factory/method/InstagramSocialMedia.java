package ahmadirfaan.springdesignpatterncreational.factory.method;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: InstagramSocialMedia.java, v 0.1 2022‐03‐10 23.06 Ahmad Irfaan Hibatullah Exp $$
 */

@ToString
public class InstagramSocialMedia implements SocialMedia {

    @Getter
    private final String name = "INSTAGRAM";

    @Getter
    private final String link = "https://instagram.com";

    @Getter
    private SocialMediaType socialMediaType = SocialMediaType.INSTAGRAM;
}