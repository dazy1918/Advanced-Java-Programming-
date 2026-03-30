List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

List<String> result = names.stream()
    .filter(name -> name.startsWith("A")) // Keep only names starting with 'A'
    .map(String::toUpperCase)             // Convert them to uppercase
    .collect(Collectors.toList());        // Gather results into a new list
// Output: [ALICE]
