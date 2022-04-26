package com.example.semana1;

/*
* SINGLE RESPONSABILITY PRINCIPLE
* */

//  ERRONEA
//data class User(val id: Int, val name: String){
//    fun user (id: Int): User{
//        //Busqueda en base de datos
//        return User(0, "")
//    }
//}

// VERDADERA
//data class User(val id: Int, val name: String)
//
//class UserDB {
//    fun user(id: Int): User{
//        //busqueda en base de datos
//        return User(0, "")
//    }
//}


/*
* OPEN CLOSED PRINCIPLE
* Principio abierto-cerrado
* Que este abierto para extenderse y cerrada para modificarse
* */


//
//data class Triangle(val length: Double, val height: Double)
//data class Circle(val radius: Double)
//
//class Area {
//    fun calculateArea(polygon: Any): Dobule? {
//        return when (polygon) {
//            is Triangle -> {
//                (polygon.length * polygon.height) / 2
//            }
//            is Circle -> {
//                Math.PI * (polygon.raidius + polygon.radius)
//            }
//            else -> {
//                null
//            }
//        }
//    }
//}


//MODIFICACION
//interface Polygon {
//    fun area(): Double
//}
//
//data class Triangle(val length: Double, val height: Double): Polygon {
//    override fun area(): Double {
//        return (length * height) / 2
//    }
//}
//
//data class Circle(val radius: Double): Polygon {
//    override fun area(): Double {
//        return Math.PI * (radius * radius)
//    }
//}
//
//data class Rectangle(val length: Double, val height: Double): Polygon {
//    override fun area(): Double {
//        return length * height
//    }
//}
//
//
//class Area {
//    fun calculateArea(polygon: Polygon): Double? {
//        return polygon.area()
//    }
//}



/*
* LISKOV SUBSTITUTION PRINCIPLE
* principio de sustitucion de liskov
* podemos usar una subclase que depende de una clase sin hacer ningun cambio en el programa
* */


//EXPLICACION
//abstract class Creature {
//    fun move() {
//        println("Move")
//    }
//    fun fly() {
//        println("Fly")
//    }
//    fun swim() {
//        println("Swim")
//    }
//}
//
//class Human: Creature() {
//    override fun fly() {
//        //No puede volar
//    }
//}
//
//class Bird: Creature() {
//}
//
//class Fish: Creature() {
//}
//
//fun main() {
//    val human = Human()
//    human.move()
//    human.fly()
//
//    val bird = Fish()
//    human.move()
//    human.fly()
//}



//MODIFICACION
//abstract class Creature {
//    fun move() {
//        println("Move")
//    }
//    fun swim() {
//        println("Swim")
//    }
//}
//
//class Human: Creature() {
//}
//
//class Bird: Creature() {
//}
//
//class Fish: Creature() {
//    fun fly() {
//        println("Fly")
//    }
//}
//
//fun main() {
//    val human = Human()
//    human.move()
//
//    val bird = Fish()
//    human.move()
//
//    val creature = Creature()  //clase base o superclase
//    creature.move()
//    creature.swim()
//}



/*
* INTERFACE SEGREGATION PRINCIPLE
* principio de segregacion de interfaz
* * */

//EXPLICACION
//interface Vehicle {
//    fun move()
//
//    fun fly()
//
//    fun swim()
//}
//
//
//class Car: Vehicle {
//    override fun move() {
//        TODO("Not yet implemented")
//    }
//
//    override fun fly() {
//        TODO("Not yet implemented")
//    }
//
//    override fun swim() {
//        TODO("Not yet implemented")
//    }
//}
//
//
//class Plane: Vehicle {
//    override fun move() {
//       TODO("Not yet implemented")
//    }
//
//    override fun fly() {
//       TODO("Not yet implemented")
//    }
//
//    override fun swim() {
//       TODO("Not yet implemented")
//    }
//}


//MODIFICACION
//interface Vehicle {
//    fun move()
//}
//
//interface FlyingVehicle {
//    fun fly()
//}
//
//interface WaterVehicle {
//    fun swim()
//}
//
//
//class Car: Vehicle {
//    override fun move() {
//        TODO("Not yet implemented")
//    }
//}
//
//class Plane: Vehicle, FlyingVehicle {
//    override fun move() {
//       TODO("Not yet implemented")
//    }
//
//    override fun fly() {
//       TODO("Not yet implemented")
//    }
//}
//
//class Boat: Vehicle, WaterVehicle {
//    override fun move() {
//       TODO("Not yet implemented")
//    }
//
//    override fun swim() {
//       TODO("Not yet implemented")
//    }
//}



/*
* DEPENDENDY INVERSION PRINCIPLE
* principio de inversion de dependencias
* debemos depender de abstracciones y no de contracciones
* */






