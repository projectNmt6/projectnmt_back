package com.projectnmt.projectnmt.dto.req;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChallengePageListReqDto {
    private int challengePageId;
    private int teamId;
    private int mainCategoryId;     //1.donation, 2.challenge
    private int pageCategoryId;    // mission, action, news
    private LocalDateTime createDate;
    private LocalDateTime endDate;
    private String challengeTitle;
    private String challengeOverview;   //챌린지 요약
    private String challengeContent;
    private String challengeMainImg;
    private int headCount;

}
