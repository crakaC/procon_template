# Requirements
- Gradle
- make

# Usage
- Set path to Kotlin Library in makefile
- Write Kotlin code in src directory
- prepare `gradle prepare`
- compile `gradle compileKotolin` or `gradle cK`
- run `make [file_name_without.kt]`

## example
```
.
├── build.gradle
├── makefile
└── src
    ├── 1.kt
    ├── template_1.kt
    └── template_2.kt

```
You can run main() at 1.kt by

`make 1`

# TODO
- [x] Remove dependency of Kotlin (Use gradle only)
- [ ] Check testcase automatically