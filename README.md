# Requirements
- Java
- make

# Usage
- Run `./gradlew prepare` first
- Write Kotlin codes in src directory
- Compile `./gradlew compileKotolin` or `./gradlew cK`
- Run `make [file_name](without extension)`

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