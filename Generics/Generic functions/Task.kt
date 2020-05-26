import java.util.*

fun <T, C : MutableCollection<T>> Collection<T>.partitionTo(collection1: C, collection2: C, operation: (T) -> Boolean): Pair<C, C> {
    for (element in this) {
        if (operation(element)) {
            collection1.add(element)
        } else {
            collection2.add(element)
        }
    }
    return Pair(collection1, collection2)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
            .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
            .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}
