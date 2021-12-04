package org.aklilutsige.wiredbarincoffe.reward;

import org.aklilutsige.wiredbarincoffe.product.Product;

import java.util.List;

public class RewardByConverstionService extends RewardService {

    private double amount;

    @Override
    public RewardInformation applyReward(List<Product> order, long customerPoints) {
        RewardInformation rewardInformation = new RewardInformation();

        if (customerPoints >= neededPoints){
            double orderTotal = calculateTotal(order);
            if (orderTotal > amount){
                rewardInformation = new RewardInformation(neededPoints, amount);
            }
        }
        return rewardInformation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
