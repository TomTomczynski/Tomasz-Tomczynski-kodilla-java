package com.kodilla.testing.forum.statistics;

import java.util.HashMap;

public class ForumUserPostStatistics  {

    int     numbersOfUsers;
    int     numberOfPosts;
    int     numberOfCmments;
    double  avePostsPerUser;
    double  aveCommentsPerUser;
    double  averageNumberOfCommentsPerPost;

    void calculateAdvStatistics(Statistics statistics){
        numbersOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfCmments = statistics.commentsCount();
        avePostsPerUser = (double)(statistics.postsCount()/statistics.usersNames().size());
        aveCommentsPerUser = (double)(statistics.commentsCount()/statistics.usersNames().size());
        averageNumberOfCommentsPerPost = (double)(statistics.commentsCount()/statistics.postsCount());
    }

    void showStatistics() {
        System.out.print("Number of users: " + getNumbersOfUsers());
        System.out.print("Number of posts" + getNumberOfPosts());
        System.out.print("Number of comments:" + getNumberOfCmments());
        System.out.print("The average number of posts per user::" + getAvePostsPerUser());
        System.out.print("The average number of comments per user:" + getAveCommentsPerUser());
        System.out.print("The average number of comments per post:" + getAverageNumberOfCommentsPerPost());
    }
    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfCmments() {
        return numberOfCmments;
    }

    public double getAvePostsPerUser() {
        return avePostsPerUser;
    }

    public double getAveCommentsPerUser() {
        return aveCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
}
