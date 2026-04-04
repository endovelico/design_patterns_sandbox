package com.dp.sandobx.behavioral.intreperter.refactor;

// This is actually a refactoring of Interpreter
// Interpreter becomes Visitor + Interpretor

/*
* Short answer: it doesn’t *replace* the Interpreter pattern—it **refactors it into a cleaner architecture**.

What people mean is:

> 👉 Instead of putting `interpret()` inside every node (classic Interpreter), you **move that logic into a Visitor**, while keeping the same tree structure.

---

## 🧠 Start from classic Interpreter

You have this:

```java
interface Expression {
    int interpret();
}
```

Each node both:

* represents structure
* contains logic

```java
class Add implements Expression {
    Expression left, right;

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
```

👉 This *is* the Interpreter pattern.

---

## 🚨 The problem again

Now you want:

* evaluation
* printing
* optimization

You end up stuffing everything into nodes ❌

---

## 🔄 Step-by-step “replacement”

### 1. Keep the same AST (this part stays!)

```java
interface Expression {
    void accept(Visitor v);
}
```

```java
class Add implements Expression {
    Expression left, right;

    public void accept(Visitor v) {
        v.visit(this);
    }
}
```

👉 Notice:

* `interpret()` is **gone**
* Nodes are now just **data**

---

### 2. Move interpretation into a Visitor

```java
class EvalVisitor implements Visitor {
    int result;

    public void visit(Add a) {
        a.left.accept(this);
        int left = result;

        a.right.accept(this);
        int right = result;

        result = left + right;
    }
}
```

---

## 💡 What just happened?

You didn’t remove interpretation—you **moved it out**.

### Before (Interpreter pattern)

```text
Add node → knows how to evaluate itself
```

### After (Interpreter + Visitor)

```text
Add node → just structure
Visitor → knows how to evaluate Add
```

---

## 🔑 Why this is considered a “replacement”

Because in practice:

* The **main purpose** of Interpreter = evaluating expressions
* Visitor can do that **just as well**
* But also supports **many other operations cleanly**

So developers think:

> “Why lock evaluation inside the nodes when I can make it one of many visitors?”

👉 That’s why the classic Interpreter pattern is often *abandoned*.

---

## 🧭 Real-world mental model

Think of it like this:

### Interpreter

Each object says:

> “I know how to execute myself”

### Visitor

A separate object says:

> “I will walk the whole tree and decide what to do”

---

## ⚖️ Tradeoff (important)

This “replacement” shifts flexibility:

| Change you want   | Interpreter | Visitor |
| ----------------- | ----------- | ------- |
| Add new operation | ❌ hard      | ✅ easy  |
| Add new node type | ✅ easy      | ❌ hard  |

---

## 🔥 Bottom line

“Interpreter + Visitor replaces Interpreter” means:

* You still build the same tree
* You **remove behavior from nodes**
* You **centralize it in visitors**

👉 It’s the same idea, just **better organized and more scalable**

---

If you want, I can show you a tiny real example (like a calculator) implemented both ways—you’ll *feel* the difference immediately.

* */