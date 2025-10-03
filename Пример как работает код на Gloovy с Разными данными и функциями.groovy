// Простой код без зависимостей
def name = "John"
def age = 25
println "Hello $name, age $age"

def list = [1, 2, 3, 4]
list.each { println "Number: $it" }

def map = [name: "Alice", age: 30]
println "Map: $map"

// Функция
def sum(a, b) { a + b }
println "5 + 3 = ${sum(5, 3)}"

// Класс
class Person {
    String name
    int age
    def info() { "$name, $age years" }
}

def person = new Person(name: "Bob", age: 25)
println person.info()



// calculator.groovy

println "как дела?"

def introduce(city="Moscow") {
    println "City: $city"
}

def a = 280
def b = 80

println "Деление: ${a / b}"
println "Деление: ${a / b}"
println 280.intdiv(80)
// Запуск: groovy calculator.groovy