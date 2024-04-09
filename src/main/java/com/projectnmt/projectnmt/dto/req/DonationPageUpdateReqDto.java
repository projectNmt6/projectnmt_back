package com.projectnmt.projectnmt.dto.req;

import com.projectnmt.projectnmt.entity.DonationPage;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DonationPageUpdateReqDto {

    private int donationPageId;
    private int teamId;
    private int mainCategoryId;
    private int donationCategoryId;
    private LocalDateTime createDate;
    private LocalDateTime endDate;
    private int goalAmount;
    private String storyTitle;
    private String storyContent;
    private String mainImgUrl;
    private int donationTagId;
    private Boolean donationPageShow;

    public DonationPage toEntity() {
        return DonationPage.builder()
                .donationPageId(donationPageId)
                .teamId(teamId)
                .mainCategoryId(mainCategoryId)
                .donationCategoryId(donationCategoryId)
                .createDate(createDate)
                .endDate(endDate)
                .goalAmount(goalAmount)
                .storyTitle(storyTitle)
                .storyContent(storyContent)
                .mainImgUrl(mainImgUrl)
                .donationTagId(donationTagId)
                .donationPageShow(donationPageShow)
                .build();

    }
}