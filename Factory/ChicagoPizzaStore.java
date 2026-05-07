public final class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza() {
        return new ChicagoStylePizza();
    }
}
