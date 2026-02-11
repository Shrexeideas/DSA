## Day 1 – Arrays

### Maximum Subarray
 Mistake:
- Initially tried brute force

Pattern:
- Carry forward running sum
- Drop negative prefix

 Insight:
- Negative sums reduce future subarrays

---

### Best Time Buy & Sell Stock
 Mistake:
- Thought in all possible pairs

 Pattern:
- Track minimum so far
- Greedy one-pass scan

 Insight:
- Buy must come before sell
