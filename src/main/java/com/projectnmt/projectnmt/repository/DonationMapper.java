package com.projectnmt.projectnmt.repository;

import com.projectnmt.projectnmt.entity.DonationPage;
import com.projectnmt.projectnmt.entity.MainCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.projectnmt.projectnmt.entity.Donation;
import com.projectnmt.projectnmt.entity.DonationTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface DonationMapper {

    public int saveDonationPage(DonationPage donationPage);
    public List<Donation> getDonationList(
            @Param("donationPageId") int donationPageId,
            @Param("teamId") int teamId,
            @Param("mainCategoryId") int mainCategoryId,
            @Param("createDate") LocalDateTime createDate,
            @Param("endDate") LocalDateTime endDate,
            @Param("goalAmount") int goalAmount,
            @Param("mainImgUrl") String mainImgUrl,
            @Param("donationTagId") int donationTagId);

    public List<DonationTag> getDonationTagList(
            @Param("donationTagId") int donationTagId,
            @Param("donationTagName") String donationTagName);

    public List<MainCategory> getMainCategoryList(
            @Param("mainCategoryId") int mainCategoryId,
            @Param("mainCategoryName") String mainCategoryName);


}

<<<<<<< HEAD
=======

>>>>>>> b23af363d0b51d0ee2f01244a70aab18685d87fc
