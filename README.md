# Unit2-02-Java-FileIO

Reads values from `input.txt` one line at a time and writes the sum of valid
integers to `output.txt`. Each line is read as a string and converted with
`Integer.parseInt`. If a line is not a valid Java `int` (including a blank
line), the program writes `Error: invalid input` and continues to the next
line. The final sum is written after all lines have been checked. An empty
input file produces `0`.

## Run

From this directory:

```sh
javac FileIO.java
java FileIO
```

Run the Java style checker with:

```sh
./run_linter.sh
```

## Test cases

| Scenario | `input.txt` contents | Expected `output.txt` |
| --- | --- | --- |
| Positive integers | `12`, `23` (one per line) | `35` |
| Negative integer | `-10` | `-10` |
| Invalid line | `4`, `nope`, `9` (one per line) | `Error: invalid input`, then `13` |
| Blank line | `4`, *(blank line)*, `9` | `Error: invalid input`, then `13` |
| Integer outside the `int` range | `2147483648` | `Error: invalid input`, then `0` |
| Empty input file | *(empty)* | `0` |

For the sample input, the valid-number calculation is
`12 + (-5) + 23 + (-10) + 0 = 20`; the invalid text and blank line are each
reported and skipped.