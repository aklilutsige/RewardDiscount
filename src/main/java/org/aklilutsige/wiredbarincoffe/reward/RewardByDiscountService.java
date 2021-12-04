package org.aklilutsige.wiredbarincoffe.reward;

import org.aklilutsige.wiredbarincoffe.product.Product;

import java.util.List;

public class RewardByDiscountService extends RewardService{
    private double percentage;

    public RewardByDiscountService() {
    }

    public RewardByDiscountService(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public RewardInformation applyReward(List<Product> order, long customerPoints) {
        RewardInformation rewardInformation = new RewardInformation();

        if (customerPoints >= neededPoints){
            double orderTotal = calculateTotal(order);
            double discount = orderTotal * percentage;
            rewardInformation = new RewardInformation(neededPoints, discount);
        }

        return rewardInformation;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        if (percentage > 0){
            this.percentage = percentage;
        }else {
            this.percentage = 1;
        }

    }
}
