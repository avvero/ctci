package pw.avvero.leet.year2023_04;

public class Problem287 {

    public int findDuplicate(int[] nums) {
        int slowi = 0;
        int slow = 0;
        int fasti = 0;
        int fast = 0;
        do {
            slowi = slow;
            slow = nums[slow];
            fasti = fast;
            fast = nums[fast];
            if (slow == fast && slowi != fasti) return slow;
            // 2
            fasti = fast;
            fast = nums[fast];
        } while(slow != fast || slowi == fasti);
        return slow;
    }

}
