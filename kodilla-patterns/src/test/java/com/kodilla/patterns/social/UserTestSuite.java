package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.SocialPublishers.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.SocialPublishers.TwitterPublisher;
import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User stevan = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User mike = new ZGeneration("Mike Less");

        //When
        String stevanPublisher = stevan.sharePost();
        System.out.println("Stevan uses: " + stevanPublisher);
        String johnPublisher = john.sharePost();
        System.out.println("John uses: " + johnPublisher);
        String mikePublisher = mike.sharePost();
        System.out.println("Mike uses: " + mikePublisher);

        //Then
        Assert.assertEquals("Facebook Publisher", stevanPublisher);
        Assert.assertEquals("Snapchat Publisher", johnPublisher);
        Assert.assertEquals("Twitter Publisher", mikePublisher);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User stevan = new Millenials("Steven Links");

        //When
        String stevanPublisher = stevan.sharePost();
        System.out.println("Stevan uses: " + stevanPublisher);
        stevan.setSocialPublisher(new SnapchatPublisher());
        stevanPublisher = stevan.sharePost();
        System.out.println("Stevan now uses: " + stevanPublisher);

        //Then
        Assert.assertEquals("Snapchat Publisher",stevanPublisher);

    }
}
