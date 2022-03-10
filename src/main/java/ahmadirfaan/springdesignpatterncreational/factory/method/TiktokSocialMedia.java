package ahmadirfaan.springdesignpatterncreational.factory.method;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: TiktokSocialMedia.java, v 0.1 2022‐03‐10 23.06 Ahmad Irfaan Hibatullah Exp $$
 */

@ToString
public class TiktokSocialMedia implements SocialMedia {

    @Getter
    private final String name = "TIKTOK";

    @Getter
    private final
    String link = "https://tiktok.com";

    @Getter
    private SocialMediaType socialMediaType = SocialMediaType.TIKTOK;
}