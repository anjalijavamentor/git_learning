function combine(a, b) {
    if (typeof a === "number" && typeof b === "string") {
        return a + b;
    }
    else {
        return a.toString() + b.toString();
    }
    console.warn(combine(10, 20));
    console.warn(combine("anjali", "sharma"));
}
