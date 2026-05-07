public final class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza() {
        return new NYStylePizza();
    }
}
