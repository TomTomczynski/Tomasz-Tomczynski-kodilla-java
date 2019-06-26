package com.kodilla.testing.forum.statistics;

import java.util.HashMap;

public class ForumUserPostStatistics  {

    int     numbersOfUsers;
    int     numberOfPosts;
    int     numberOfComments;
    double  avePostsPerUser;
    double  aveCommentsPerUser;
    double  averageNumberOfCommentsPerPost;

    void calculateAdvStatistics(Statistics statistics){
        numbersOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
//        avePostsPerUser = (double)(statistics.postsCount()/statistics.usersNames().size());
        if(statistics.usersNames().size() == 0 ){
            avePostsPerUser=0;
        } else {
            avePostsPerUser = (double)(statistics.postsCount()/statistics.usersNames().size());
        };
        if (statistics.usersNames().size() == 0 ) {
            aveCommentsPerUser = 0;
        } else {
            aveCommentsPerUser = (double)(statistics.commentsCount()/statistics.usersNames().size());
        };
        if(statistics.postsCount() == 0 ){
            averageNumberOfCommentsPerPost=0;
        } else {
            averageNumberOfCommentsPerPost = (double)(statistics.commentsCount()/statistics.postsCount());
        };
    }

    void showStatistics() {
        System.out.print("Number of users: " + getNumbersOfUsers());
        System.out.print("Number of posts" + getNumberOfPosts());
        System.out.print("Number of comments:" + getNumberOfComments());
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

    public int getNumberOfComments() {
        return numberOfComments;
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
