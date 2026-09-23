# Linked List Midterm Practice

These problems use the same singly linked-list and insertion patterns as `Link_list/Inserction_2`.

## Problem 1: Descending Insertion

Create `insertDescending(Node start, int value)`. Insert values into a linked list so the final list is sorted from largest to smallest.

Input values:

```java
{15, 40, 5, 30, 20, 10}
```

Expected output:

```text
40 -> 30 -> 20 -> 15 -> 10 -> 5 -> null
```

Solution: `solutions/Problem01_DescendingInsertion.java`

## Problem 2: Append an Array Without Sorting

Create `appendList(Node start, int[] values)`. Add every array value to the end of the linked list and preserve the original array order.

Input values:

```java
{70, 20, 90, 10, 40}
```

Expected output:

```text
70 -> 20 -> 90 -> 10 -> 40 -> null
```

Solution: `solutions/Problem02_AppendArray.java`

## Problem 3: Delete All Even Values

Create `deleteEven(Node start)`. Remove every even-valued node and return the new head.

Input list:

```text
5 -> 10 -> 15 -> 20 -> 25 -> 30 -> null
```

Expected output:

```text
5 -> 15 -> 25 -> null
```

Solution: `solutions/Problem03_DeleteEven.java`

## Problem 4: Reverse the List In Place

Create `reverse(Node start)`. Reverse the links directly without using an array.

Input list:

```text
10 -> 20 -> 30 -> null
```

Expected output:

```text
30 -> 20 -> 10 -> null
```

Solution: `solutions/Problem04_ReverseList.java`

## Problem 5: Merge Two Sorted Lists

Create `merge(Node first, Node second)`. Merge two already sorted lists into one sorted list. Do not insert every value again using the sorted-insertion method.

Input lists:

```text
First:  10 -> 30 -> 50 -> null
Second: 20 -> 40 -> 60 -> null
```

Expected output:

```text
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
```

Solution: `solutions/Problem05_MergeLists.java`
