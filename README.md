
# LeetCode Challenge D26

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1608. Special Array With X Elements Greater Than or Equal X](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
You are given a  *0-indexed*  array  `nums`  of length  `n`.

The  *distinct difference*  array of  `nums`  is an array  `diff`  of length  `n`  such that  `diff[i]`  is equal to the number of distinct elements in the suffix  `nums[i + 1, ..., n - 1]`  *subtracted from*  the number of distinct elements in the prefix  `nums[0, ..., i]`.

Return  _the  *distinct difference*  array of_ `nums`.

Note that  `nums[i, ..., j]`  denotes the subarray of  `nums`  starting at index  `i`  and ending at index  `j`  inclusive. Particularly, if  `i > j`  then  `nums[i, ..., j]`  denotes an empty subarray.

**Example**
> **Input:** nums = [1,2,3,4,5]
> 
>**Output:** [-3,-1,1,3,5]
> 
>**Explanation:** For index i = 0, there is 1 element in the prefix and 4 distinct elements in the suffix. Thus, diff[0] = 1 - 4 = -3.
For index i = 1, there are 2 distinct elements in the prefix and 3 distinct elements in the suffix. Thus, diff[1] = 2 - 3 = -1.
For index i = 2, there are 3 distinct elements in the prefix and 2 distinct elements in the suffix. Thus, diff[2] = 3 - 2 = 1.
For index i = 3, there are 4 distinct elements in the prefix and 1 distinct element in the suffix. Thus, diff[3] = 4 - 1 = 3.
For index i = 4, there are 5 distinct elements in the prefix and no elements in the suffix. Thus, diff[4] = 5 - 0 = 5.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The solution calculates the distinct difference array for a given input array `nums`. It employs a nested loop structure to iterate through each element of `nums` and computes the difference in the count of distinct elements between the prefix (elements preceding the current element) and the suffix (elements following the current element). The implementation uses auxiliary arrays to store the prefix and suffix, and a separate method, `countDistinct`, to calculate the count of distinct elements. While this approach achieves the desired result, it exhibits a time complexity of O(n^3) due to nested loops and array copying, which might be less efficient for larger input sizes.
