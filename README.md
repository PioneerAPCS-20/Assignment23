# Assignment 23

In DNA strings, nucleobases 'A' and 'T' are complements of each other, as are 'C' and 'G'.

The reverse complement of a DNA string *s* is the string s<sup>c</sup> formed by reversing the symbols of *s*, then taking the complement of each symbol (e.g., the reverse complement of "GTCA" is "TGAC" because As and Ts swap and Gs and Cs swap).

## Specifications

Write a function that takes a `String` as input and returns the reverse compliment strand as a `String`. One class is fine and test your function in `main`.

## Hints

<details>
    <summary>Click to see hint</summary>

        One way to approach this is to start at the end of the given strand and work your way to the front. As you do that, take each symbol and add the complement of it to the new string. When your loop finishes (reaches the front) your new string should be the reverse complement of the original strand.
        
</details>

### Sample Outputs

```
Enter the DNA strand: AAAACCCGGT

The reverse compliment is ACCGGGTTTT
```

```
Enter the DNA strand: GCTTCGAGTATTGCAGGC

The reverse compliment is GCCTGCAATACTCGAAGC
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.
