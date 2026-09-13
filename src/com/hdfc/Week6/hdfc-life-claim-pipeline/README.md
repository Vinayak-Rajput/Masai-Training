# HDFC Life Claim Pipeline

A Java console example that models claim processing with custom data structures, graph traversal, priority handling, and concurrency utilities.

## Features

- Singly linked-list insertion, deletion, reversal, middle-node lookup, and cycle detection
- Addition of numbers represented as linked lists
- Array-backed stacks and circular queues
- Parentheses validation and postfix expression evaluation
- Priority-queue claim handling
- Branch traversal with breadth-first search
- Threads, executors, `Callable`, `Future`, `CompletableFuture`, cancellation, and producer-consumer coordination
- Custom exceptions for invalid indexes and empty data structures

## Source layout

```text
src/com/hdfclife/
├── Main.java
├── list/       Linked-list operations and cycle algorithms
├── queue/      Circular queues, priority handling, and BFS
├── stack/      Stack operations and stack-based algorithms
├── thread/    Runnable, Callable, Future, and producer-consumer examples
├── model/     Claim-related models
└── exception/ Domain-specific exceptions
```

## Complexity summary

| Feature | Time | Extra space |
| --- | --- | --- |
| List insert/delete | O(n) | O(1) |
| Iterative list reverse | O(n) | O(1) |
| Recursive list reverse | O(n) | O(n) |
| Cycle detection and cycle start | O(n) | O(1) |
| Middle-node lookup | O(n) | O(1) |
| Add two linked-list numbers | O(max(m, n)) | O(max(m, n)) |
| Stack push/pop | O(1) | O(1) |
| Circular queue enqueue/dequeue | O(1) | O(1) |
| Branch BFS | O(V + E) | O(V) |

## Queue design note

A linked-list queue is useful when traffic is unbounded or highly variable because it grows without a fixed capacity. A fixed or circular array is preferable when memory limits, predictable latency, cache locality, and bounded throughput are more important than dynamic growth. The project includes both styles so their trade-offs can be compared directly.

## Running

Open this directory as an independent Java project and run `com.hdfclife.Main` from an IDE with a compatible JDK. The demonstration uses a no-argument `static void main()` method, so configure the IDE accordingly or add the conventional `main(String[] args)` launcher before using a standard command-line invocation.
