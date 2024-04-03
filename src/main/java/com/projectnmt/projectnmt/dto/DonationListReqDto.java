package com.projectnmt.projectnmt.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DonationListReqDto {
    private int donationPageId;
    private int teamId;
    private int mainCategoryId;
    private String donationName;
    private LocalDateTime createDate;
    private LocalDateTime endDate;
    private int goalAmount;
    private String mainImgUrl;
    private int donationTagId;

}
