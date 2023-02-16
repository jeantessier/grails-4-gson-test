# GSON Test

This is a simple Hello World application to show how GSON views work.

## To Run

```bash
./gradlew bootRun
```

You can get call the one action with:

```bash
http :8080/hello
```

You can pass query parameters (and see them) with:

```bash
http --verbose :8080/hello name=="Jean Tessier" age==29
```

You can pass request parameters (and see them) with:

```bash
http --verbose :8080/hello name="Jean Tessier" age=29
```
