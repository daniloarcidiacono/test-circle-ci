package io.github.daniloarcidiacono.test.ci;

public abstract class Operations {
    // This makes JaCoCo happy (requires version 0.8.0)
    // https://github.com/jacoco/jacoco/issues/621
    private Operations() {
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
