package net.Aboufariss.business;
@FunctionalInterface
public interface Condition<T> {
    boolean test(T t);
}
