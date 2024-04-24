package com.projectnmt.projectnmt.repository;

import com.projectnmt.projectnmt.entity.DonationImage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface DonationImageMapper {

    public int saveDonationImages(DonationImage donationImage);

    public int deleteDonationImageById(@Param("donationImageId") int donationImageId);

    public List<DonationImage> getDonationImageLIst(
            @Param("donationImageId") int donationImageId,
            @Param("donationPageId") int donationPageId,
            @Param("donationImageNumber") int donationImageNumber,
            @Param("donationImageURL") String donationImageURL,
            @Param("userId") int userId,
            @Param("createDate") LocalDateTime createDate
    );

    List<DonationImage> getDonationImageByDonationPageId(int donationPageId);
}