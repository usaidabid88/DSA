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
<summary><b>🥞 Stacks & Queues (Click to expand)</b></summary>
<br/>

- **Array-Backed Queue:** Implements a circular ring buffer with `front` and `rear` pointers using modular arithmetic `(rear + 1) % capacity` to eliminate element shifting.
- **Sentinel Doubly Linked Queue:** Employs a dummy head/sentinel node where `head.next = head` and `head.previous = head` initially, removing null edge cases during insertions and deletions.
- **Dynamic Resizing Stack:** Automatically doubles capacity using `System.arraycopy` when the backing array reaches full load.
</details>

<details>
<summary><b>🔍 Hashing & Open Addressing (Click to expand)</b></summary>
<br/>

- **Hash Function:** Converts object 32-bit signed hash codes into non-negative indices using bitwise masking:
  $$\text{index} = (\text{key.hashCode()} \ \& \ \text{0x7fffffff}) \pmod{\text{capacity}}$$
- **Naive Hash Table:** Direct slot allocation without collision resolution to demonstrate hashing fundamentals.
- **Linear Probing Table:** Open addressing mechanism probing consecutive indices `(h + i) % capacity` with sentinel `NIL` markers to preserve probe chains after deletion.
- **Custom Entity Mapping:** Fast key-value lookups storing rich `Country(name, language, population)` objects mapped by ISO country codes.
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
