package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumUserPostStatisticsTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCalculateAdvStatistics_1() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        when(ststisticMock.commentsCount()).thenReturn(0);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(10);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int resoult = forumUserPostStatitics.getNumberOfCmments();

        //Then
        Assert.assertEquals(0, resoult);
    }

    @Test
    public void testCalculateAdvStatistics_2() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        when(ststisticMock.commentsCount()).thenReturn(1000);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(10);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int resoult = forumUserPostStatitics.getNumberOfCmments();

        //Then
        Assert.assertEquals(1000, resoult);
    }

    @Test
    public void testCalculateAdvStatistics_3() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        when(ststisticMock.commentsCount()).thenReturn(0);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(0);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int resoult = forumUserPostStatitics.getNumberOfCmments();

        //Then
        Assert.assertEquals(0, resoult);
    }

    @Test
    public void testCalculateAdvStatistics_4() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        when(ststisticMock.commentsCount()).thenReturn(20);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(100);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        double resoult = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(20 / 100, resoult, 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_5() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        when(ststisticMock.commentsCount()).thenReturn(100);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(35);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        double resoult = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(100 / 35, resoult, 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_6() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        when(ststisticMock.commentsCount()).thenReturn(100);
        List<String> usersNames = new ArrayList<>();
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(35);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int resoult = forumUserPostStatitics.getNumbersOfUsers();

        //Then
        Assert.assertEquals(0, resoult);
    }

    @Test
    public void testCalculateAdvStatistics_7() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        when(ststisticMock.commentsCount()).thenReturn(100);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(35);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int resoult = forumUserPostStatitics.getNumbersOfUsers();

        //Then
        Assert.assertEquals(100, resoult);
    }
}