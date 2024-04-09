package com.projectnmt.projectnmt.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Donator {
    private int donatorId;
    private int userId;
    private LocalDateTime donationDate;
    private int amount;
    private int donationPageId;
    private boolean anonymous;

    private User user;
    private DonationPage donationPage ;
    private Comment comment;

}