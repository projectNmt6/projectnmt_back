package com.projectnmt.projectnmt.dto.req;

import lombok.Data;

@Data
public class GetLikeReqDto {
    private int donationPageId;
    private int userId;
    private int commentId;
}

