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
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(0);
        when(ststisticMock.commentsCount()).thenReturn(10);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int numberOfCmments = forumUserPostStatitics.getNumberOfComments();
        int numberOfPosts = forumUserPostStatitics.getNumberOfPosts();
        int numbersOfUsers = forumUserPostStatitics.getNumbersOfUsers();
        double averageNumberOfCommentsPerPost = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();
        double aveCommentsPerUser = forumUserPostStatitics.getAveCommentsPerUser();
        double avePostsPerUser = forumUserPostStatitics.getAvePostsPerUser();


        //Then
        Assert.assertEquals(10, numberOfCmments);
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertEquals(10, numbersOfUsers);
        Assert.assertEquals(0, averageNumberOfCommentsPerPost,0.01);
        Assert.assertEquals(10/10, aveCommentsPerUser,0.01);
        Assert.assertEquals(0, avePostsPerUser,0.01);
    }

    @Test
    public void testCalculateAdvStatistics_2() {
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(1000);
        when(ststisticMock.commentsCount()).thenReturn(10);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int numberOfComments = forumUserPostStatitics.getNumberOfComments();
        int numberOfPosts = forumUserPostStatitics.getNumberOfPosts();
        int numbersOfUsers = forumUserPostStatitics.getNumbersOfUsers();
        double averageNumberOfCommentsPerPost = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();
        double aveCommentsPerUser = forumUserPostStatitics.getAveCommentsPerUser();
        double avePostsPerUser = forumUserPostStatitics.getAvePostsPerUser();



        //Then
        Assert.assertEquals(10, numberOfComments);
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(10, numbersOfUsers);
        Assert.assertEquals(10/1000, averageNumberOfCommentsPerPost,0.01);
        Assert.assertEquals(1, aveCommentsPerUser,0.01);
        Assert.assertEquals(1000/10, avePostsPerUser,0.01);
    }

    @Test
    public void testCalculateAdvStatistics_3() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(100);
        when(ststisticMock.commentsCount()).thenReturn(0);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int numberOfComments = forumUserPostStatitics.getNumberOfComments();
        int numberOfPosts = forumUserPostStatitics.getNumberOfPosts();
        int numbersOfUsers = forumUserPostStatitics.getNumbersOfUsers();
        double averageNumberOfCommentsPerPost = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();
        double aveCommentsPerUser = forumUserPostStatitics.getAveCommentsPerUser();
        double avePostsPerUser = forumUserPostStatitics.getAvePostsPerUser();

        //Then
        Assert.assertEquals(0, numberOfComments);
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(10, numbersOfUsers);
        Assert.assertEquals(0/100, averageNumberOfCommentsPerPost,0.01);
        Assert.assertEquals(0/10, aveCommentsPerUser,0.01);
        Assert.assertEquals(100/10, avePostsPerUser,0.01);
    }

    @Test
    public void testCalculateAdvStatistics_4() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(100);
        when(ststisticMock.commentsCount()).thenReturn(1000);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int numberOfComments = forumUserPostStatitics.getNumberOfComments();
        int numberOfPosts = forumUserPostStatitics.getNumberOfPosts();
        int numbersOfUsers = forumUserPostStatitics.getNumbersOfUsers();
        double averageNumberOfCommentsPerPost = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();
        double aveCommentsPerUser = forumUserPostStatitics.getAveCommentsPerUser();
        double avePostsPerUser = forumUserPostStatitics.getAvePostsPerUser();

        //Then
        Assert.assertEquals(1000, numberOfComments);
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(10, numbersOfUsers);
        Assert.assertEquals(1000/100, averageNumberOfCommentsPerPost,0.01);
        Assert.assertEquals(1000/10, aveCommentsPerUser,0.01);
        Assert.assertEquals(100/10, avePostsPerUser,0.01);
    }

    @Test
    public void testCalculateAdvStatistics_5() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(1000);
        when(ststisticMock.commentsCount()).thenReturn(200);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int numberOfComments = forumUserPostStatitics.getNumberOfComments();
        int numberOfPosts = forumUserPostStatitics.getNumberOfPosts();
        int numbersOfUsers = forumUserPostStatitics.getNumbersOfUsers();
        double averageNumberOfCommentsPerPost = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();
        double aveCommentsPerUser = forumUserPostStatitics.getAveCommentsPerUser();
        double avePostsPerUser = forumUserPostStatitics.getAvePostsPerUser();

        //Then
        Assert.assertEquals(200, numberOfComments);
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(10, numbersOfUsers);
        Assert.assertEquals(200/1000, averageNumberOfCommentsPerPost,0.01);
        Assert.assertEquals(200/10, aveCommentsPerUser,0.01);
        Assert.assertEquals(1000/10, avePostsPerUser,0.01);
    }

    @Test
    public void testCalculateAdvStatistics_6() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(1000);
        when(ststisticMock.commentsCount()).thenReturn(200);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int numberOfComments = forumUserPostStatitics.getNumberOfComments();
        int numberOfPosts = forumUserPostStatitics.getNumberOfPosts();
        int numbersOfUsers = forumUserPostStatitics.getNumbersOfUsers();
        double averageNumberOfCommentsPerPost = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();
        double aveCommentsPerUser = forumUserPostStatitics.getAveCommentsPerUser();
        double avePostsPerUser = forumUserPostStatitics.getAvePostsPerUser();

        //Then
        Assert.assertEquals(200, numberOfComments);
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(0, numbersOfUsers);
        Assert.assertEquals(200/1000, averageNumberOfCommentsPerPost,0.01);
        Assert.assertEquals(0, aveCommentsPerUser,0.01);
        Assert.assertEquals(0, avePostsPerUser,0.01);
    }

    @Test
    public void testCalculateAdvStatistics_7() {
        //Given
        ForumUserPostStatistics forumUserPostStatitics = new ForumUserPostStatistics();
        Statistics ststisticMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) usersNames.add("User_" + (i + 1));
        when(ststisticMock.usersNames()).thenReturn(usersNames);
        when(ststisticMock.postsCount()).thenReturn(1000);
        when(ststisticMock.commentsCount()).thenReturn(200);

        //When
        forumUserPostStatitics.calculateAdvStatistics(ststisticMock);
        int numberOfComments = forumUserPostStatitics.getNumberOfComments();
        int numberOfPosts = forumUserPostStatitics.getNumberOfPosts();
        int numbersOfUsers = forumUserPostStatitics.getNumbersOfUsers();
        double averageNumberOfCommentsPerPost = forumUserPostStatitics.getAverageNumberOfCommentsPerPost();
        double aveCommentsPerUser = forumUserPostStatitics.getAveCommentsPerUser();
        double avePostsPerUser = forumUserPostStatitics.getAvePostsPerUser();

        //Then
        Assert.assertEquals(200, numberOfComments);
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(100, numbersOfUsers);
        Assert.assertEquals(200/1000, averageNumberOfCommentsPerPost,0.01);
        Assert.assertEquals(200/100, aveCommentsPerUser,0.01);
        Assert.assertEquals(1000/100, avePostsPerUser,0.01);
    }
}