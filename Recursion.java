public static int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

public static int pow(int x, int n) {
    if (n == 0) {
        return 1;
    } else {
        return x * pow(x, n - 1);
    }
}

public static void reverseString(String s, int n) {
    if (n == 0) {
        return;
    } else {
        System.out.print(s.charAt(n - 1));
        reverseString(s, n - 1);
    }
}

public static void hanoi(int n, int S, int D, int E) {
    if (n == 1) {
        System.out.println("move 1 ring from tower " + S + " to tower " + D);
    } else {
        hanoi(n - 1, S, E, D);
        System.out.println("move 1 ring from tower " + S + " to tower " + D);
        hanoi(n - 1, E, D, S);
    }
}
