object MySnippet
new MySnippet

// the first expression successfully defines an
// object called "MySnippet." The second one is
// incorrect: you cannot request the creation of an
// object. When using the keyword new, the compiler
// looks for a class or type called MySnippet; an
// object is neither, so the compiler rejects it with
// missing type error.