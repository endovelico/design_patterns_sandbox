package com.dp.sandobx.behavioral.visitor;


// ===== Concrete Visitor =====
class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = book.getPrice();
        if (cost > 50) {
            cost -= 5; // discount for expensive books
        }
        System.out.println("Book ISBN: " + book.getIsbn() + ", Cost: " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }
}