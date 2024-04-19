package com.projectnmt.projectnmt.repository;

import com.projectnmt.projectnmt.dto.*;
import com.projectnmt.projectnmt.dto.req.DonationGivingReqDto;
import com.projectnmt.projectnmt.entity.Comment;
import com.projectnmt.projectnmt.entity.Donator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface DonatorMapper {
    public int saveDonation(DonationGivingReqDto donationGivingReqDto);
    public int saveComment(Comment comment);
    public List<MyDonationListRespDto> getMyList (GetMyDonationListReqDto getMyDonationListReqDto);
    public AmountRespDto saveAmount();
    public ProgressAmountRespDto HomeDonation(int donationPageId);

    public List<Donator> getDonatorList(
            @Param("donatorId") int donatorId,
            @Param("userId") int userId,
            @Param("donationDate") LocalDateTime donationDate,
            @Param("amount") int amount,
            @Param("donationPageId") int donationPageId,
            @Param("anonymous") boolean anonymous
    );

    List<Donator> getDonationGivingByDonationPageId(int donationPageId);

}
