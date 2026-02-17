## Day 1 – Arrays

### Maximum Subarray
What went wrong:
- First thought was brute force (checking all subarrays), which is too slow.

What I learned:
- Keep a running sum.
- If the sum becomes negative, it’s better to start fresh from the next element.

Key takeaway:
- A negative prefix only reduces future subarray sums.


### Best Time to Buy & Sell Stock
What went wrong:
- Initially thought about checking every buy–sell pair.

What I learned:
- Track the minimum price seen so far.
- At each day, calculate profit if selling today.

Key takeaway:
- Since buying must happen before selling, only past prices matter.

## Day 2 – Two Pointers

### Container With Most Water
What went wrong:
- Mixed brute force logic with two-pointer logic.
- Confused `length` with `length - 1`.
- Used `Math.min` instead of `Math.max` when updating the answer.
- Missed some valid pairs because of wrong loop start.

What I learned:
- Start with two pointers at both ends.
- The area is always limited by the shorter line.
- Move the pointer pointing to the smaller height.

Key takeaway:
- `length` is the number of elements, `length - 1` is the last index.
- Use `Math.min` for constraints and `Math.max` for tracking the best answer.

### Remove Element
 Mistake:
- Initially thought about deleting elements

 Pattern:
- Overwrite valid elements using write pointer

 Insight:
- Deletion in arrays is done by overwriting, not removing

### Problem Solving Steps from Video
1. Understand example
2. Dry run manually
3. Identify what to carry forward
4. Use loop
5. Modify array if needed

🧠 Final Insight:
- Most array problems are solved by traversal + carrying one variable

