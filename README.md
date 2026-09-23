<div align="center">

# 🧠 Data Structures & Algorithms in Java ☕

**A comprehensive, from-scratch repository mastering fundamental and advanced Data Structures & Algorithms.**

[![Language](https://img.shields.io/badge/Language-Java_17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Focus](https://img.shields.io/badge/Focus-DSA_&_Problem_Solving-4B8BBE?style=for-the-badge&logo=codeforces&logoColor=white)](https://github.com/usaidabid88/DSA)
[![Status](https://img.shields.io/badge/Status-Active_Development-2ea44f?style=for-the-badge)](https://github.com/usaidabid88/DSA)
[![University](https://img.shields.io/badge/Coursework-MUET-blueviolet?style=for-the-badge)](https://www.muet.edu.pk/)

<br/>

> *"Every complex system is built from simple, well-understood foundations."*  
> Each topic starts with **pure foundational implementations**, followed by **applied problem-solving tasks** and **exam/interview preparation suites**.

</div>

---

## ✨ Key Highlights

- 🛠️ **Built From Scratch** — No built-in `java.util` shortcuts (`ArrayList`, `LinkedList`, `HashMap`); everything is implemented ground-up with raw arrays and pointer manipulations.
- 📐 **Dual Architectural Paradigms** — Direct comparison of **Array-backed** vs **Linked Node** implementations for Stacks, Queues, and Hash Tables.
- 🎯 **Applied Practice Tasks** — Practical exercises including credit/debit transaction matching, Sentinel circular doubly linked queues, and ISO country record hashing.
- 🔄 **Recursive Problem Solving** — Recursive tree calculations and multi-dimensional array-of-linked-list traversals.
- 🏆 **Midterm & Exam Preparation** — Dedicated problem suites covering in-place pointer reversal, descending sorted insertion, even-node deletion, and two-pointer list merging.
- 🚀 **Plug & Play Execution** — Standalone drivers (`main`) in every module for instant compilation and execution.

---

## 📂 Repository Architecture

```plaintext
DSA/
├── 📁 ARRAY/
│   └── Inserction_Delection.java             # Low-level dynamic array insert, shift & delete operations
│
├── 📁 Link_list/
│   ├── 📁 Basics_1/                          # Node definitions, linear chaining, and basic traversals
│   │   └── 📁 Tasks/                         # Initial node linking exercises
│   ├── 📁 Inserction_2/                      # Sorted insertion & specialized operations
│   │   └── 📁 Tasks/                         # Reverse list, merge sorted lists, sublists, averages, sum, target search
│   └── 📁 Delection_3/                       # Deletion variants & list division
│       └── 📁 Tasks/                         # Partitioning lists, node value replacement
│
├── 📁 STACK/
│   ├── 📁 Basics/                            # Core Stack interface, ArrayStack (resizing), LinkedStack
│   └── 📁 tasks/                             # Min-element tracking, stack reversal, equality, splitting
│
├── 📁 Queue/
│   ├── 📁 Basics/                            # Circular ArrayQueue with modulo arithmetic & demo
│   └── 📁 Task/                              # Circular doubly linked queue with Sentinel node & transaction task
│
├── 📁 Hashing/
│   ├── 📁 Basic/
│   │   ├── 📁 Naive_hash/                    # Direct-address array hash table without collision handling
│   │   └── 📁 Linear_probation_hash/         # Open addressing hash table with Linear Probing & NIL tombstones
│   └── 📁 Task/                              # Custom entity storage (Country records) using Hash Table
│
├── 📁 Recursion/
│   └── 📁 Task/
│       ├── Fibonacci.java                    # Recursive sequence generation with base-case branching
│       └── Print_array_of_linkedlist.java    # 2D recursive traversal over an array of linked list heads
│
└── 📁 prep/                                  # Comprehensive Exam & Interview Preparation Modules
    ├── 📁 Midterm_Practice/solutions/
    │   ├── Problem01_DescendingInsertion.java # Descending sorted linked list insertion
    │   ├── Problem02_AppendArray.java        # Sequential array-to-linked-list conversion
    │   ├── Problem03_DeleteEven.java         # In-place deletion of even-valued nodes
    │   ├── Problem04_ReverseList.java        # 3-pointer in-place iterative list reversal
    │   └── Problem05_MergeLists.java         # O(m + n) sorted linked list merging with dummy head
    ├── 📁 Queue/
    │   ├── Queue.java                        # Queue ADT Interface
    │   └── LinkedQueue.java                  # Sentinel circular doubly linked queue with toArray export
    ├── 📁 stack/
    │   ├── Stack.java                        # Stack ADT Interface
    │   ├── ArrayStack.java                   # Dynamic array stack with min/max, mid lookup & splitting
    │   └── LinkedStack.java                  # Linked stack with auxiliary stack sorting & two-pointer mid
    ├── 📁 INSERCTION/
    │   └── Node.java                         # Consolidated singly linked list driver (types, batching, search)
    └── 📁 dilision/
        └── Node.java                         # Singly linked list deletion and in-place node replacement
```

---

## 📊 Learning Roadmap & Progress

| Topic | Category | Implementation Highlights | Status |
| :--- | :--- | :--- | :---: |
| **Arrays** | Linear Memory | Fixed-size array resizing, in-place insertion, element deletion with manual shifts | 🟢 `Completed` |
| **Singly Linked Lists** | Linear Pointer | Head/tail insertion, in-place reversal, sorted merging, sublist division, averages | 🟢 `Completed` |
| **Stacks** | LIFO | Dynamic resizing array stack & pointer-linked stack with `peek`, `pop`, `push`, min-lookup, sorting | 🟢 `Completed` |
| **Queues** | FIFO | Circular array queue with modulo arithmetic; Sentinel-based circular doubly linked queue | 🟢 `Completed` |
| **Hashing** | Associative | Bitwise hash distribution (`& 0x7fffffff`), open addressing with linear probing, `NIL` tombstones | 🟢 `Completed` |
| **Recursion** | Algorithmic | Mathematical series generation, multi-level recursive traversal of composite data structures | 🟢 `Completed` |
| **Prep Suite** | Exam / Interview | 5 core midterm algorithms, advanced sentinel queues, auxiliary stack sorting | 🟢 `Completed` |
| **Trees & BST** | Hierarchical | Binary Search Tree traversals, insertion, deletion, balancing | ⚪ `Planned` |
| **Sorting Algorithms** | Algorithms | Quick Sort, Merge Sort, Insertion Sort, Heap Sort | ⚪ `Planned` |
| **Graphs** | Non-Linear | Adjacency matrix/list representations, BFS, DFS, shortest path | ⚪ `Planned` |

---

## 🛠️ Deep Dives by Topic

<details>
<summary><b>📦 1. Arrays & Dynamic Memory Operations</b></summary>

<br/>

### Overview
Demonstrates foundational contiguous memory allocation and manual index-based data manipulation in Java without relying on `java.util.ArrayList`.

### Key Concepts & Implementations
- **Manual Element Insertion:** Allocates a new array of size `n + 1`, copies elements up to the target index, places the new value, and shifts subsequent elements right.
- **Manual Element Deletion:** Allocates an array of size `n - 1` and skips the specified position, shifting subsequent elements left.
- **Time Complexity:**
  - Access / Update: `O(1)`
  - Insert / Delete at position: `O(n)` (due to manual array copying and shifting)

```plaintext
Insert at index 2:
[10, 20, 30, 40] ──> [10, 20] + [25] + [30, 40] ──> [10, 20, 25, 30, 40]
```

</details>

<details>
<summary><b>🔗 2. Singly Linked Lists & Pointer Manipulations</b></summary>

<br/>

### Overview
Dynamic node-based linear data structures where each node stores a data payload and a reference (`next`) to the subsequent node.

### Key Concepts & Implementations
- **Core Operations:** Node linking, head insertion, tail appending, and iterative traversal.
- **Sorted Insertion (`insert`):** Traverses the chain and inserts elements in ascending/descending order without requiring pre-sorting.
- **In-Place List Reversal:** Iteratively reverses pointers using a 3-pointer sliding window (`prev`, `curr`, `next`) to achieve `O(n)` time and `O(1)` space.
- **List Merging & Splitting:** Merges two independently sorted lists into a single consolidated sequence; partitions lists based on pivot ranges.
- **Statistical Aggregations:** Computes node count, sum, average, and extracts even/odd filtered elements.
- **Time Complexity:**
  - Insertion at Head: `O(1)`
  - Search / Traversal / Deletion: `O(n)`

```plaintext
Node Structure:
[ Data | Next ] ──> [ Data | Next ] ──> [ Data | Next ] ──> null
```

</details>

<details>
<summary><b>🥞 3. Stacks (LIFO — Last In, First Out)</b></summary>

<br/>

### Overview
Implementations of the Stack Abstract Data Type (ADT) comparing fixed/dynamic contiguous arrays with dynamic linked nodes.

### Key Concepts & Implementations
- **Array-Backed Stack (`Array_stack` / `ArrayStack`):**
  - Uses an internal `Object[]` buffer and a `size` / `top` integer index.
  - **Dynamic Resizing:** Doubles capacity using `System.arraycopy()` when the buffer fills.
- **Linked-List Stack (`Linked_stack` / `LinkedStack`):**
  - Pushes and pops from the head of a linked node chain for guaranteed `O(1)` operations without resizing overhead.
- **Advanced Stack Features:**
  - `getmin()` / `getmax()`: Scans stack elements to identify extreme values.
  - `getmid()`: Retrieves the middle element using the two-pointer (slow/fast) technique.
  - `sortStack()`: Sorts stack elements in-place using an auxiliary temporary stack in `O(n^2)` time.
  - `equal()` & `split()`: Checks structural equality and partitions a stack into two balanced sub-stacks.
- **Time Complexity:**
  - `push(obj)`: `O(1)` amortized (Array) / `O(1)` strict (Linked)
  - `pop()` / `peek()` / `isEmpty()`: `O(1)`

```plaintext
Push (10 -> 20 -> 30) | Pop -> 30
┌─────┐
│ 30  │ <── Top (peek / pop)
├─────┤
│ 20  │
├─────┤
│ 10  │
└─────┘
```

</details>

<details>
<summary><b>🚶‍♂️ 4. Queues (FIFO — First In, First Out)</b></summary>

<br/>

### Overview
Implementations of the Queue ADT comparing circular array buffers with sentinel-based circular doubly linked lists.

### Key Concepts & Implementations
- **Circular Array Queue (`Array_queue`):**
  - Uses `front` and `rear` pointers with modular arithmetic:
    `rear = (rear + 1) % capacity` and `front = (front + 1) % capacity`
  - Reuses vacant slots left by `remove()` in `O(1)` time without shifting elements.
- **Sentinel Circular Doubly Linked Queue (`Linked_queue` / `LinkedQueue`):**
  - Employs a dummy **Sentinel Node** where `head.next = head` and `head.previous = head` initially.
  - Every real data node is guaranteed to have non-null `next` and `previous` neighbors.
  - Completely eliminates null pointer checks and edge cases for 0-element and 1-element queues.
- **Applied Tasks:**
  - Transaction sum comparison (`Credit` vs `Debit` queues).
  - Array export via `toArray()` for sublist slicing and verification.
- **Time Complexity:**
  - `add(obj)` (Enqueue): `O(1)`
  - `remove()` (Dequeue): `O(1)`
  - `first()` (Peek): `O(1)`

```plaintext
Circular Doubly Linked Queue with Sentinel:
┌────────────────────────────────────────────────────────┐
▼                                                        │
[ Sentinel ] <───> [ Node 1 ] <───> [ Node 2 ] <───> [ Node 3 ]
│                                                        ▲
└────────────────────────────────────────────────────────┘
```

</details>

<details>
<summary><b>🔍 5. Hashing & Open Addressing</b></summary>

<br/>

### Overview
Key-value associative mapping implementations utilizing bitwise integer hashing, direct arrays, and open addressing collision resolution.

### Key Concepts & Implementations
- **Non-Negative Bitwise Hash Function:**
  ```java
  public int hash(Object key) {
      return (key.hashCode() & 0x7fffffff) % entries.length;
  }
  ```
  - `key.hashCode()`: Extracts Java's 32-bit integer hash code.
  - `& 0x7fffffff`: Strips the sign bit (masks 31 bits) ensuring non-negative integers.
  - `% entries.length`: Maps the integer hash into valid array bucket indices `[0 .. capacity - 1]`.

- **Naive Hash Table (`Naive_hash/`):**
  - Direct array slot mapping to demonstrate pure hashing fundamentals.
  - Serves as the architectural baseline before introducing collision resolution.

- **Linear Probing Hash Table (`Linear_probation_hash/`):**
  - **Collision Resolution:** When index `h` is occupied, probes consecutive slots `(h + i) % capacity`.
  - **Tombstone Sentinel (`NIL`):** When an entry is deleted, marks the slot with `NIL` (`new Entry(null, null)`) instead of `null` so subsequent probe chains during `get()` are not prematurely broken.

- **Applied Dataset Task (`Hashing/Task/Country.java`):**
  - Stores rich `Country` entities (name, language, population) indexed by 2-letter ISO country codes (`"PK"`, `"IN"`).
  - Demonstrates constant-time record retrieval and key deletion.

- **Time Complexity:**
  - Average Case (`put`, `get`, `remove`): `O(1)`
  - Worst Case (high load factor / clustering): `O(n)`

```plaintext
Linear Probing Probe Sequence:
Hash(Key) = 3
Index:  [0]   [1]   [2]   [3]      [4]      [5]
Array: [   ] [   ] [   ] [ PK ] ──> [ IN ] ──> [ Free Slot ]
                         (occupied) (occupied)   (inserted here!)
```

</details>

<details>
<summary><b>🔄 6. Recursion & Composite Data Traversals</b></summary>

<br/>

### Overview
Recursive algorithmic problem-solving exploring mathematical recurrence relations and recursive traversals across nested pointer structures.

### Key Concepts & Implementations
- **Mathematical Recurrence (`Fibonacci.java`):**
  - Computes Fibonacci sequence terms using binary branching recursion:
    $$F(n) = F(n-1) + F(n-2) \quad \text{with } F(0)=0, F(1)=1$$
  - Demonstrates call stack frame allocation and base-case termination.
- **2D Recursive Linked List Traversal (`Print_array_of_linkedlist.java`):**
  - Combines array-index recursion with node-chain recursion:
    - `printArray(lists, index)`: Recursively advances across the array of linked list heads.
    - `printList(node)`: Recursively traverses and prints each individual node chain.
- **Time Complexity:**
  - Fibonacci (Direct Recursion): `O(2^n)`
  - Array of Linked Lists Traversal: `O(N * M)` where `N` is array size and `M` is list length.

```plaintext
Recursive Call Tree for Array of Linked Lists:
printArray(lists, 0)
 ├── printList(lists[0]) ──> Node1 ──> Node2 ──> null
 └── printArray(lists, 1)
      ├── printList(lists[1]) ──> Node1 ──> Node2 ──> null
      └── printArray(lists, 2) ──> ...
```

</details>

<details>
<summary><b>🏆 7. Midterm Practice & Exam Preparation Suite</b></summary>

<br/>

### Overview
Curated algorithmic problem set designed for midterm exam preparation and technical problem-solving mastery under strict pointer constraints.

### Problems & Algorithms
1. **Descending Sorted Insertion (`Problem01_DescendingInsertion.java`):** Inserts a node into a sorted singly linked list maintaining descending order.
2. **Sequential Array Appending (`Problem02_AppendArray.java`):** Reads an array sequentially and appends each element to the tail of a linked list in `O(n)` time.
3. **In-Place Even Deletion (`Problem03_DeleteEven.java`):** Traverses a linked list and removes all nodes with even integer values in-place, properly updating head pointers and intermediate links.
4. **Iterative 3-Pointer Reversal (`Problem04_ReverseList.java`):** Reverses a singly linked list in-place using `previous`, `current`, and `next` pointers with zero auxiliary memory.
5. **Sorted List Merging (`Problem05_MergeLists.java`):** Merges two independently sorted lists into a unified ascending list in `O(m + n)` time using a dummy anchor head.

```plaintext
3-Pointer In-Place Reversal:
[prev]      [curr] ──> [next]
 null   <── [ 10 ]     [ 20 ] ──> [ 30 ] ──> null
```

</details>

---

## ▶️ Compilation & Execution Guide

All modules are self-contained with their own `main` methods. You can compile and run any file directly from the repository root:

### 1️⃣ Run Linked List Tasks
```bash
# Compile and run Linked List reversal
javac Link_list/Inserction_2/Tasks/Reverse_linked_list.java
java Link_list.Inserction_2.Tasks.Reverse_linked_list
```

### 2️⃣ Run Stack & Queue Implementations
```bash
# Run Circular Doubly Linked Queue Demo
javac Queue/Task/Linked_Main.java Queue/Task/Linked_queue.java Queue/Task/Queue.java
java Queue.Task.Linked_Main

# Run Linked Stack with Min/Max and Auxiliary Sort
javac STACK/tasks/Linked_main.java STACK/tasks/Linked_stack.java STACK/tasks/Stack.java
java STACK.tasks.Linked_main
```

### 3️⃣ Run Hashing & Country Dataset Task
```bash
# Run Linear Probing Hash Table demo with Country records
javac Hashing/Task/*.java
java Hashing.Task.Country
```

### 4️⃣ Run Recursion & Midterm Practice Suite
```bash
# Run Array of Linked Lists Recursive Traversal
javac Recursion/Task/Print_array_of_linkedlist.java
java Recursion.Task.Print_array_of_linkedlist

# Run In-Place List Reversal Midterm Solution
javac prep/Midterm_Practice/solutions/Problem04_ReverseList.java
java prep.Midterm_Practice.solutions.Problem04_ReverseList
```

---

<div align="center">

### 👨‍💻 Maintained by **[Usaid Abid](https://github.com/usaidabid88)**
*Department of Software Engineering, Mehran University of Engineering & Technology (MUET)*

⭐ **Star this repository** if you find these from-scratch implementations helpful!

</div>
