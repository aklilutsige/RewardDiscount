package org.aklilutsige.wiredbarincoffe.reward;

public class RewardInformation {
    private long pointRedeemed;
    private double discount;

    public RewardInformation(long pointRedeemed, double discount) {
        this.pointRedeemed = pointRedeemed;
        this.discount = discount;
    }

    public RewardInformation() {
    }

    public long getPointRedeemed() {
        return pointRedeemed;
    }

    public void setPointRedeemed(long pointRedeemed) {
        this.pointRedeemed = pointRedeemed;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
