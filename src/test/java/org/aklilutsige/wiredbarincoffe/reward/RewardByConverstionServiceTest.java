package org.aklilutsige.wiredbarincoffe.reward;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RewardByConverstionServiceTest {
    @Test
    @Order(1)
    void setNeededPoints() {
        RewardByConverstionService reward = new RewardByConverstionService();

        reward.setNeededPoints(100);
        assertEquals(100, reward.getNeededPoints());

    }
    @Test
    @Order(2)
   void setPercentageForPoints(){
      RewardByDiscountService reward = new RewardByDiscountService();
       reward.setPercentage(0.1);

       assertEquals(0.1, reward.getPercentage());
    }

}
