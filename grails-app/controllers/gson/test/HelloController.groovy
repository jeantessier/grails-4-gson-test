package gson.test

class HelloController {

    def index(IndexCommand cmd) {
        log.error "cmd: ${cmd}"

        def actualName = cmd.name ?: "World"
        def actualAge = cmd.age ?: 13_900_000

        log.error "actualName: ${actualName}"
        log.error "actualAge: ${actualAge}"

        [
                name: actualName,
                age: actualAge,
        ]
    }

}

class IndexCommand {

    String name
    int age

    String toString() {
        [
                name: name,
                age: age,
        ] as String
    }

}
