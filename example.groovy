// 1. БАЗОВЫЙ СИНТАКСИС
def name = "John"
def age = 25
println "Hello $name, age $age"

// 2. КОЛЛЕКЦИИ
def list = [1, 2, 3, 4]
def map = [name: "Alice", age: 30]

list.each { println it }
println map.name

// 3. ФУНКЦИИ
def sum(a, b) { a + b }
println "Sum: ${sum(5, 3)}"

// 4. ЗАМЫКАНИЯ
def square = { it * it }
println "Square: ${square(4)}"

// 5. ФАЙЛЫ
new File("test.txt").write("Hello Groovy")
println new File("test.txt").text

// 6. КЛАССЫ
class Person {
    String name
    int age
    def info() { "$name, $age years" }
}

def person = new Person(name: "Bob", age: 25)
println person.info()

// 7. JSON
@Grab('groovy-json')
import groovy.json.JsonOutput

def data = [users: [[name: "Tom", active: true]]]
println JsonOutput.toJson(data)

// 8. ФИЛЬТРАЦИЯ
def users = [[name: "John", active: true], [name: "Kate", active: false]]
def active = users.findAll { it.active }
println "Active: ${active.collect{it.name}}"