<div align="center">

# 🧠 Data Structures & Algorithms in Java ☕

**A hands-on, from-scratch journey mastering fundamental and advanced Data Structures & Algorithms.**

[![Language](https://img.shields.io/badge/Language-Java_17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Focus](https://img.shields.io/badge/Focus-DSA_&_Problem_Solving-4B8BBE?style=for-the-badge&logo=codeforces&logoColor=white)](https://github.com/usaidabid88/DSA)
[![Status](https://img.shields.io/badge/Status-Active_Development-2ea44f?style=for-the-badge)](https://github.com/usaidabid88/DSA)
[![University](https://img.shields.io/badge/Coursework-MUET-blueviolet?style=for-the-badge)](https://www.muet.edu.pk/)

<br/>

> *"Every complex system is built from simple, well-understood foundations."*  
> Each topic starts with **pure foundational implementations**, followed by **applied problem-solving tasks**.

</div>

---

## ✨ Key Highlights

- 🛠️ **Built From Scratch** — No built-in `java.util` shortcuts (`ArrayList`, `LinkedList`, `HashMap`); everything is implemented ground-up with raw arrays and pointer manipulations.
- 📐 **Dual Architectural Paradigms** — Direct comparison of **Array-backed** vs **Linked Node** implementations for Stacks, Queues, and Hash Tables.
- 🎯 **Applied Practice Tasks** — Practical real-world exercises (e.g., Credit/Debit transaction comparison, Sentinel doubly-linked circular queues, Country dataset record hashing).
- 🚀 **Plug & Play Execution** — Standalone drivers (`main`) in every module for instant compilation and execution.

---

## 📂 Repository Architecture

```plaintext
DSA/
├── 📁 ARRAY/
│   └── Inserction_Delection.java             # Low-level dynamic array insert & delete operations
│
├── 📁 Link_list/
│   ├── 📁 Basics_1/                          # Node definition, traversal, and direct chain linking
│   ├── 📁 Inserction_2/                      # Sorted insertion & specialized operations
│   │   └── 📁 Tasks/                         # Reverse list, merge sorted lists, split, averages, sum
│   ├── 📁 Delection_3/                      # Deletion variants & list division
│   │   └── 📁 Tasks/                         # Partitioning lists, node replacement
│   └── 📁 DSA_test/                          # Custom node experiments
│
├── 📁 STACK/
│   ├── 📁 Basics/                            # Core Stack interface, ArrayStack (resizing), LinkedStack
│   └── 📁 tasks/                             # Min-element tracking, stack reversal, equality, splitting
│
├── 📁 QUEUE/
│   ├── 📁 Basics/                            # Circular ArrayQueue with modulo arithmetic & demo
│   └── 📁 Task/                              # Circular doubly linked queue with Sentinel node & transaction task
│
└── 📁 Sorting_&_Searching/
    ├── 📁 Basic/
    │   ├── 📁 Naive_hash/                    # Direct-address array hash table without collision handling
    │   └── 📁 Linear_probation_hash/         # Open addressing hash table with Linear Probing & NIL tombstones
    └── 📁 Task/                              # Custom entity storage (Country records) using Hash Table
```

---

## 📊 Learning Roadmap & Progress

| Topic | Category | Implementation Highlights | Status |
| :--- | :--- | :--- | :---: |
| **Arrays** | Linear | Fixed-size array resizing, in-place insertion, element deletion with shifts | 🟢 `Completed` |
| **Singly Linked Lists** | Linear Pointer | Head/tail insertion, in-place reversal, sorted merging, sublist division, averages | 🟢 `Completed` |
| **Stacks** | LIFO | Dynamic resizing array-backed stack & pointer-linked stack with `peek`, `pop`, `push`, min-lookup | 🟢 `Completed` |
| **Queues** | FIFO | Circular array queue with wrap-around pointers; Sentinel-based circular doubly linked list | 🟢 `Completed` |
| **Hashing** | Associative | Bitwise hash distribution (`& 0x7fffffff`), open addressing with linear probing, `NIL` tombstones | 🟡 `In Progress` |
| **Trees & BST** | Hierarchical | Binary Search Tree traversals, insertion, deletion, balancing | ⚪ `Planned` |
| **Sorting Algorithms** | Algorithms | Quick Sort, Merge Sort, Insertion Sort, Heap Sort | ⚪ `Planned` |
| **Graphs** | Non-Linear | Adjacency matrix/list representations, BFS, DFS, shortest path | ⚪ `Planned` |

---

## 🛠️ Deep Dives by Topic

<details>
<summary><b>📦 1. Arrays & Dynamic Operations</b></summary>

<br/>

### Overview
Demonstrates foundational contiguous memory allocation and manual index-based data manipulation in Java.

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
<summary><b>🔗 2. Singly Linked Lists</b></summary>

<br/>

### Overview
Dynamic node-based linear data structure where each node stores a data value and a reference (`next`) to the subsequent node.

### Key Concepts & Implementations
- **Core Operations:** Node linking, head insertion, tail appending, and iterative traversal.
- **Sorted Insertion (`insert`):** Traverses the chain and inserts elements in ascending order without requiring pre-sorting.
- **In-Place List Reversal:** Iteratively reverses pointers / arrays to invert the order of nodes.
- **List Merging & Splitting:** Merges two independently sorted lists into a single consolidated sequence; partitions lists based on pivot values.
- **Statistical Aggregations:** Computes node count, sum, average, and extracts even-indexed elements.
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
- **Array-Backed Stack (`Array_stack`):**
  - Uses an internal `Object[]` buffer and a `top` integer index.
  - **Dynamic Resizing:** Doubles capacity using `System.arraycopy()` when the stack reaches full load.
- **Linked-List Stack (`Linked_stack`):**
  - Pushes and pops from the head of a linked node chain for guaranteed `O(1)` operations without resizing overhead.
- **Advanced Stack Features:**
  - `getMin()`: Tracks the minimum element in the stack.
  - `sortStack()`: Sorts the stack elements using auxiliary space.
  - `equal()` & `split()`: Checks structural equality and partitions a stack into two halves.
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
- **Sentinel Circular Doubly Linked Queue (`Linked_queue`):**
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
  - `key.hashCode()`: Extracts Java's 32-bit integer hash.
  - `& 0x7fffffff`: Strips the negative sign bit (converts negative hash codes to positive).
  - `% entries.length`: Maps the hash code directly into valid array bucket indices `[0 .. capacity - 1]`.

- **Naive Hash Table (`Naive_hash/`):**
  - Direct array slot mapping to demonstrate hashing fundamentals.
  - Serves as the baseline before introducing collision resolution.

- **Linear Probing Hash Table (`Linear_probation_hash/`):**
  - **Collision Resolution:** When index `h` is occupied, probes consecutive slots `(h + i) % capacity`.
  - **Tombstone Sentinel (`NIL`):** When an entry is deleted, marks the slot with `NIL` (`new Entry(null, null)`) instead of `null` so subsequent probe chains during `get()` are not prematurely broken.

- **Applied Dataset Task (`Task/Country.java`):**
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

---

## ▶️ Compilation & Execution Guide

All modules are self-contained with their own `main` methods. You can compile and run any file directly from the repository root:

### 1️⃣ Run Linked List Tasks
```bash
# Compile and run Linked List reversal
javac Link_list/Inserction_2/Tasks/Reverse_linked_list.java
java Link_list.Inserction_2.Tasks.Reverse_linked_list
```

### 2️⃣ Run Queue Implementations
```bash
# Run Circular Doubly Linked Queue Demo
javac Queue/Task/Linked_Main.java Queue/Task/Linked_queue.java Queue/Task/Queue.java
java Queue.Task.Linked_Main
```

### 3️⃣ Run Hash Table & Country Dataset Task
```bash
# Run Linear Probing Hash Table demo with Country records
javac Sorting_\&_Searching/Task/*.java
java -cp "Sorting_&_Searching/Task" Country
```

---

<div align="center">

### 👨‍💻 Maintained by **[Usaid Abid](https://github.com/usaidabid88)**
*Coursework & Algorithms Practice at MUET (Department of Software Engineering)*

⭐ **Star this repository** if you find these from-scratch implementations helpful!

</div>
