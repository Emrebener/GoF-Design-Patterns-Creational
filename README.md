# GoF Design Patterns — Creational

Java examples accompanying the blog series on the Gang of Four creational design patterns.

Creational patterns deal with object construction: *who* decides which concrete type gets instantiated, *when* it gets instantiated, and *how* the rest of the program gets a reference to it. They exist to keep construction logic out of the code that uses the resulting objects, so callers depend on abstractions rather than constructors.

The files in this repository are illustrative — classes only, no entry points, no runtime behaviour. Each pattern lives in its own folder with one file per implementation variant.

## Patterns covered

- [Abstract Factory Pattern](./AbstractFactory)
- [Builder Pattern](./Builder)
- [Factory Pattern](./Factory)
- Object Pool Pattern
- Prototype Pattern
- [Singleton Pattern](./Singleton)
