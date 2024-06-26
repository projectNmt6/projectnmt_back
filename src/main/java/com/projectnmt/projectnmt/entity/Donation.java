package com.projectnmt.projectnmt.entity;
import com.projectnmt.projectnmt.dto.resp.DonationListRespDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Donation {
    private int donationPageId;
    private int teamId;
    private int mainCategoryId;
    private int pageCategoryId;
    private String storyTitle;
    private LocalDateTime createDate;
    private LocalDateTime endDate;
    private int goalAmount;
    private String mainImgUrl;
    private int donationTagId;

    private Team team;
    private MainCategory mainCategory;
    private DonationTag donationTag;
    private int donationPageShow;

    private Like like;
    private int countLike;

    public DonationListRespDto toDonationListRespDto() {
        return DonationListRespDto.builder()
                .donationPageId(donationPageId)
                .teamName(team.getTeamName())
                .teamId(teamId)
                .mainCategoryName(mainCategory.getMainCategoryName())
                .storyTitle(storyTitle)
                .createDate(createDate)
                .endDate(endDate)
                .goalAmount(goalAmount)
                .mainImgUrl(mainImgUrl)
                .donationTagId(donationTagId)
                .donationPageShow(donationPageShow)
                .countLike(countLike)
                .build();
    }





}